package com.polyakov.task1.validator;

import com.polyakov.task1.validator.impl.ArrayStringValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStringValidatorImplTest {
  static final ArrayStringValidator arrayStringValidator = new ArrayStringValidatorImpl();
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
  void isValid() {
    String string = "2e2 1 2 4";
    boolean expected = false;
    boolean actual = arrayStringValidator.isValid(string);
    assertEquals(expected,actual);
  }
}