package com.polyakov.task1.comparator;

import com.polyakov.task1.entity.CustomArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomArraySorterTest {
  static List<CustomArray> arrays;

  @BeforeEach
  void setUp() {
    CustomArray customArray1 = new CustomArray(1, new int[]{10});
    CustomArray customArray2 = new CustomArray(2, new int[]{2,2});
    CustomArray customArray3 = new CustomArray(3, new int[]{3,2,3});
    arrays = new ArrayList<>();
    arrays.add(customArray1);
    arrays.add(customArray2);
    arrays.add(customArray3);
  }

  @AfterEach
  void tearDown() {
    arrays.clear();
  }

  @Test
  void sortById() {
    CustomArraySorter.sortById(arrays);
    assertAll(
            () -> assertArrayEquals(new int[]{10},arrays.get(0).getElements()),
            () -> assertArrayEquals(new int[]{2,2},arrays.get(1).getElements()),
            () -> assertArrayEquals(new int[]{3,2,3},arrays.get(2).getElements())
    );
  }

  @Test
  void sortByLength() {
    CustomArraySorter.sortByLength(arrays);
    assertAll(
            () -> assertArrayEquals(new int[]{10},arrays.get(0).getElements()),
            () -> assertArrayEquals(new int[]{2,2},arrays.get(1).getElements()),
            () -> assertArrayEquals(new int[]{3,2,3},arrays.get(2).getElements())
    );
  }

  @Test
  void sortByFirstElement() {
    CustomArraySorter.sortByFirstElement(arrays);
    assertAll(
            () -> assertArrayEquals(new int[]{10},arrays.get(2).getElements()),
            () -> assertArrayEquals(new int[]{2,2},arrays.get(0).getElements()),
            () -> assertArrayEquals(new int[]{3,2,3},arrays.get(1).getElements())
    );
  }

  @Test
  void sortBySum() {
    CustomArraySorter.sortBySum(arrays);
    assertAll(
            () -> assertArrayEquals(new int[]{10},arrays.get(2).getElements()),
            () -> assertArrayEquals(new int[]{2,2},arrays.get(0).getElements()),
            () -> assertArrayEquals(new int[]{3,2,3},arrays.get(1).getElements())
    );
  }
}