package com.polyakov.task1.parser.impl;

import com.polyakov.task1.parser.ArrayStringParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStringParserImpl implements ArrayStringParser {
  static final Logger log = LogManager.getLogger();
  static final String WHITESPACE_REGEX = "\\s+";
  @Override
  public int [] parse(String string) {
    String[] stringTokens = string.strip().split(WHITESPACE_REGEX);
    int[] array = Arrays.stream(stringTokens).mapToInt(Integer::parseInt).toArray();
    return array;
  }

  @Override
  public List<String> parseStream(List<String> fileData) {
    return fileData.stream()
            .map(String::strip)
            .flatMap(line -> Arrays.stream(line.split("\\s+")))
            .collect(Collectors.toList());
  }
}
