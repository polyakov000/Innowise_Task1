package com.polyakov.task1.validator;

import com.polyakov.task1.validator.impl.DataValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorImplTest {
  static final DataValidator dataValidator = new DataValidatorImpl();
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
    String token = "2e2";
    boolean expected = false;
    boolean actual = dataValidator.isValid(token);
    assertEquals(expected,actual);
  }
}