package com.polyakov.task1.parser;

import com.polyakov.task1.parser.impl.ArrayStringParserImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayStringParserImplTest {
  static final ArrayStringParser stringParser = new ArrayStringParserImpl();

  @BeforeEach
  void setUp() {}

  @AfterEach
  void tearDown() {}

  @Test
  void parse(){
    String string = "1 2 23 44";
    int[] expected = new int[]{1,2,23,44};
    int[] actual = stringParser.parse(string);
    assertArrayEquals(expected,actual);
  }
}