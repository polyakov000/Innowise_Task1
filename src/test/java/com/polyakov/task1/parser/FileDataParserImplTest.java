package com.polyakov.task1.parser;

import com.polyakov.task1.parser.impl.FileDataParserImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileDataParserImplTest {
  static final FileDataParser fileDataParser = new FileDataParserImpl();
  static final Logger log = LogManager.getLogger();

  @BeforeEach
  void setUp(TestInfo testInfo) {
    log.info("{} started", testInfo.getDisplayName());
  }

  @AfterEach
  void tearDown(TestInfo testInfo) {
    log.info("{} ended", testInfo.getDisplayName());
  }

  @Test
  void parse() {
    List<String> strings = List.of("12 e 23 4e4");
    List<String> expected = Arrays.asList("12","e","23","4e4");
    List<String> actual = fileDataParser.parse(strings);
    assertEquals(expected,actual);
  }
  @Test
  void parseStream(){
    List<String> strings = List.of("12 e 23 4e4");
    List<String> expected = Arrays.asList("12","e","23","4e4");
    List<String> actual = fileDataParser.parseStream(strings);
    assertEquals(expected,actual);
  }
}