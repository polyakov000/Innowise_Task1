package com.polyakov.task1.warehouse;

import com.polyakov.task1.entity.ArrayStatistics;
import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.observer.impl.ArrayObserverImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
  CustomArray customArray = new CustomArray(1,new int[]{1,2,3,4});;
  @BeforeEach
  void setUp() {
    customArray.addObserver(new ArrayObserverImpl());
  }

  @Test
  void getArraysStatsMap() {
    customArray.setElements(new int[]{1});
    ArrayStatistics expected = ArrayStatistics.Builder()
            .max(1)
            .min(1)
            .sum(1)
            .averageValue(1.0)
            .build();


    ArrayStatistics actual = Warehouse.getArraysStatsMap().get(1L);
    assertEquals(expected,actual);
  }
}