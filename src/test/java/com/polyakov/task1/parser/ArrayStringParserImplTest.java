package com.polyakov.task1.parser;

import com.polyakov.task1.parser.impl.ArrayStringParserImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayStringParserImplTest {
  static final Logger log = LogManager.getLogger();
  static final ArrayStringParser stringParser = new ArrayStringParserImpl();

  @BeforeEach
  void setUp(TestInfo testInfo) {
    log.info("{} started", testInfo.getDisplayName());
  }

  @AfterEach
  void tearDown(TestInfo testInfo) {
    log.info("{} ended", testInfo.getDisplayName());
  }

  @Test
  void parse(){
    String string = "1 2 23 44";
    int[] expected = new int[]{1,2,23,44};
    int[] actual = stringParser.parse(string);
    assertArrayEquals(expected,actual);
  }
}