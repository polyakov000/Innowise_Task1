package com.polyakov.task1.comparator;

import com.polyakov.task1.entity.CustomArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomArraySorter {

  public static void sortById(List<CustomArray> arrays) {
    Collections.sort(arrays, Comparator.comparingLong(CustomArray::getId));
  }

  public static void sortByLength(List<CustomArray> arrays) {
    Collections.sort(arrays, Comparator.comparingInt(CustomArray::getLength));
  }

  public static void sortByFirstElement(List<CustomArray> arrays) {
    Collections.sort(arrays, Comparator.comparingInt(customArray -> customArray.getElements()[0]));
  }

  public static void sortBySum(List<CustomArray> arrays) {
    Collections.sort(arrays, Comparator.comparingInt(arr ->
            Arrays.stream(arr.getElements()).sum()));
  }
}
