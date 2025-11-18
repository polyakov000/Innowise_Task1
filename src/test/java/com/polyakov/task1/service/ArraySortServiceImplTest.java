package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class ArraySortServiceImplTest {

  static final ArraySortService arraySortService = new ArraySortServiceImpl();
  static final CustomArray CUSTOM_ARRAY = new CustomArray(1,new int[]{2,1,5,4,3});
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
  void selectionSort() throws CustomArrayException {
    arraySortService.selectionSort(CUSTOM_ARRAY);
    int[] expected = {1,2,3,4,5};
    int[] actual = CUSTOM_ARRAY.getElements();
    assertArrayEquals(expected,actual);
  }

  @Test
  void bubbleSort() throws CustomArrayException {
    arraySortService.bubbleSort(CUSTOM_ARRAY);
    int[] expected = {1,2,3,4,5};
    int[] actual = CUSTOM_ARRAY.getElements();
    assertArrayEquals(expected,actual);
  }

  @Test
  void insertionSort() throws CustomArrayException {
    arraySortService.insertionSort(CUSTOM_ARRAY);
    int[] expected = {1,2,3,4,5};
    int[] actual = CUSTOM_ARRAY.getElements();
    assertArrayEquals(expected,actual);
  }
  @Test
  void streamSort() throws CustomArrayException {
    arraySortService.streamSort(CUSTOM_ARRAY);
    int[] expected = {1,2,3,4,5};
    int[] actual = CUSTOM_ARRAY.getElements();
    assertArrayEquals(expected,actual);
  }
}