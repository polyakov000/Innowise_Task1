package com.polyakov.task1.validator;

import com.polyakov.task1.validator.impl.ArrayStringValidatorImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStringValidatorImplTest {
  static final ArrayStringValidator arrayStringValidator = new ArrayStringValidatorImpl();

  @BeforeEach
  void setUp() {}

  @AfterEach
  void tearDown() {}

  @Test
  void isValid() {
    String string = "2e2 1 2 4";
    boolean expected = false;
    boolean actual = arrayStringValidator.isValid(string);
    assertEquals(expected,actual);
  }
}