package com.polyakov.task1.comparator;

import com.polyakov.task1.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {
  @Override
  public int compare(CustomArray a1, CustomArray a2) {
    return Long.compare(a1.getId(), a2.getId());
  }
}

