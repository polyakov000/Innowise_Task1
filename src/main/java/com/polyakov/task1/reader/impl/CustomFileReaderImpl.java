package com.polyakov.task1.reader.impl;

import com.polyakov.task1.exception.CustomFileException;
import com.polyakov.task1.reader.CustomFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CustomFileReaderImpl implements CustomFileReader {
  static final Logger log = LogManager.getLogger();
  @Override
  public List<String> readFile(String filePath) throws CustomFileException {
    Path path = Path.of(filePath);
    List<String> strings;
    try {
      strings = Files.readAllLines(path);
      log.info("File successfully read");
    }catch(IOException e){
      log.fatal("File with such path: {} cannot be found or read", path);
      throw new CustomFileException("File cannot be found or read\n Cause: " + e.getCause());
    }
    return strings;
  }
}
