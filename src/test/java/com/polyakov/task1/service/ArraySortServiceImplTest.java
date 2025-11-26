package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.impl.ArraySortServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class ArraySortServiceImplTest {
  static final ArraySortService arraySortService = new ArraySortServiceImpl();
  CustomArray customArray;
  @BeforeEach
  void setUp() {
    customArray = new CustomArray(1,new int[]{2,1,5,4,3});
  }

  @AfterEach
  void tearDown() {}

  @Test
  void selectionSort() throws CustomArrayException {
    arraySortService.selectionSort(customArray);
    int[] expected = {1,2,3,4,5};
    int[] actual = customArray.getElements();
    assertArrayEquals(expected,actual);
  }

  @Test
  void bubbleSort() throws CustomArrayException {
    arraySortService.bubbleSort(customArray);
    int[] expected = {1,2,3,4,5};
    int[] actual = customArray.getElements();
    assertArrayEquals(expected,actual);
  }

  @Test
  void insertionSort() throws CustomArrayException {
    arraySortService.insertionSort(customArray);
    int[] expected = {1,2,3,4,5};
    int[] actual = customArray.getElements();
    assertArrayEquals(expected,actual);
  }
  @Test
  void streamSort() throws CustomArrayException {
    arraySortService.streamSort(customArray);
    int[] expected = {1,2,3,4,5};
    int[] actual = customArray.getElements();
    assertArrayEquals(expected,actual);
  }
}