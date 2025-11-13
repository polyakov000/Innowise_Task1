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

  static final ArrayOperationsService arrayOperationsService = new ArrayOperationsServiceImpl();
  static final CustomArray CUSTOM_ARRAY = new CustomArray(1,new int[]{1,2,3,4,5});
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
  void findAverageValue() throws CustomArrayException {
    double expected = 3;
    double actual = arrayOperationsService.findAverageValue(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void findMaxValue() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.findMaxValue(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void findMinValue() throws CustomArrayException {
    int expected = 1;
    int actual = arrayOperationsService.findMinValue(CUSTOM_ARRAY);
    assertEquals(expected, actual);
  }

  @Test
  void positiveCount() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.positiveCount(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void negativeCount() throws CustomArrayException {
    int expected = 0;
    int actual = arrayOperationsService.negativeCount(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void sum() throws CustomArrayException {
    double expected = 15;
    double actual = arrayOperationsService.sum(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void findAverageValueStream() throws CustomArrayException {
    double expected = 3;
    double actual = arrayOperationsService.findAverageValueStream(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void findMaxValueStream() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.findMaxValueStream(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void findMinValueStream() throws CustomArrayException {
    int expected = 1;
    int actual = arrayOperationsService.findMinValueStream(CUSTOM_ARRAY);
    assertEquals(expected, actual);
  }

  @Test
  void positiveCountStream() throws CustomArrayException {
    int expected = 5;
    int actual = arrayOperationsService.positiveCountStream(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void negativeCountStream() throws CustomArrayException {
    int expected = 0;
    int actual = arrayOperationsService.negativeCount(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void sumStream() throws CustomArrayException {
    double expected = 15;
    double actual = arrayOperationsService.sumStream(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

}