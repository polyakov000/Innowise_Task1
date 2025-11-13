package com.polyakov.task1.parser.impl;

import com.polyakov.task1.parser.FileDataParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileDataParserImpl implements FileDataParser {
  static final Logger log = LogManager.getLogger();
  @Override
  public List<String> parse(List<String> fileData) {
    List<String> tokens = new ArrayList<>();
    for(String line : fileData){
      String[] lineTokens = line.strip().split("\\s+");
      tokens.addAll(Arrays.asList(lineTokens));
    }
    return tokens;
  }

  @Override
  public List<String> parseStream(List<String> fileData) {
    return fileData.stream()
            .map(String::strip)
            .flatMap(line -> Arrays.stream(line.split("\\s+")))
            .collect(Collectors.toList());
  }
}
