package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.impl.ArrayOperationsServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOperationsServiceImplTest {
  static final Logger log = LogManager.getLogger();
  static final ArrayOperationsService arrayOperationsService = new ArrayOperationsServiceImpl();
  CustomArray customArray;
  @BeforeEach
  void setUp(TestInfo testInfo) {
    log.info("{} started", testInfo.getDisplayName());
    customArray = new CustomArray(1,new int[]{1,2,3,4,5});
  }

  @AfterEach
  void tearDown(TestInfo testInfo) {
    log.info("{} ended", testInfo.getDisplayName());
  }

  @Test
  void findMaxValue() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.findMaxValue(customArray);
    assertEquals(expected,actual);
  }

  @Test
  void findMinValue() throws CustomArrayException {
    int expected = 1;
    int actual = arrayOperationsService.findMinValue(customArray);
    assertEquals(expected, actual);
  }

  @Test
  void positiveCount() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.positiveCount(customArray);
    assertEquals(expected,actual);
  }

  @Test
  void negativeCount() throws CustomArrayException {
    int expected = 0;
    int actual = arrayOperationsService.negativeCount(customArray);
    assertEquals(expected,actual);
  }

  @Test
  void findMaxValueStream() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.findMaxValueStream(customArray);
    assertEquals(expected,actual);
  }

  @Test
  void findMinValueStream() throws CustomArrayException {
    int expected = 1;
    int actual = arrayOperationsService.findMinValueStream(customArray);
    assertEquals(expected, actual);
  }

  @Test
  void positiveCountStream() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.positiveCountStream(customArray);
    assertEquals(expected,actual);
  }

  @Test
  void negativeCountStream() throws CustomArrayException {
    int expected = 0;
    int actual = arrayOperationsService.negativeCount(customArray);
    assertEquals(expected,actual);
  }
}