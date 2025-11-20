package com.polyakov.task1.comparator;

import com.polyakov.task1.entity.CustomArray;

import java.util.Comparator;

public class FirstElementComparator implements Comparator<CustomArray> {
  @Override
  public int compare(CustomArray customArray1, CustomArray customArray2) {
    return Integer.compare(customArray1.getElements()[0],customArray2.getElements()[0]);
  }
}
