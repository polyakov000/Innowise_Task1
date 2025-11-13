package com.polyakov.task1.reader;

import com.polyakov.task1.exception.CustomFileException;

import java.io.FileNotFoundException;
import java.util.List;

public interface CustomFileReader {
  List<String> readFile(String filePath) throws CustomFileException;
}
