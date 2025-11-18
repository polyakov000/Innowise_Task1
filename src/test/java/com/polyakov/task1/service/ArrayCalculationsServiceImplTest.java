package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.impl.ArrayCalculationsServiceImpl;
import com.polyakov.task1.service.impl.ArrayOperationsServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCalculationsServiceImplTest {
  static final ArrayCalculationsService arrayCalculationsService = new ArrayCalculationsServiceImpl();
  static final CustomArray CUSTOM_ARRAY = new CustomArray(1,new int[]{1,2,3,4,5});

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void calculateAverageValue() throws CustomArrayException {
    double expected = 3;
    double actual = arrayCalculationsService.calculateAverageValue(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void calculateAverageValueStream() throws CustomArrayException {
    double expected = 3;
    double actual = arrayCalculationsService.calculateAverageValueStream(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void sum() throws CustomArrayException {
    double expected = 15;
    double actual = arrayCalculationsService.sum(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }

  @Test
  void sumStream() throws CustomArrayException {
    double expected = 15;
    double actual = arrayCalculationsService.sumStream(CUSTOM_ARRAY);
    assertEquals(expected,actual);
  }
}