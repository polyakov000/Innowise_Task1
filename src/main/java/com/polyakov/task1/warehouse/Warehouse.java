package com.polyakov.task1.warehouse;

import com.polyakov.task1.entity.ArrayStatistics;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  static Warehouse warehouse;
  static Map<Long, ArrayStatistics> arraysStatsMap = new HashMap<>();

  private Warehouse(){
  }
  public static Warehouse getInstance(){
    if(warehouse == null){
      warehouse = new Warehouse();
    }
    return warehouse;
  }
  public void put(long id, ArrayStatistics arrayStatistics){
    arraysStatsMap.put(id, arrayStatistics);
  }
  public static Map<Long, ArrayStatistics> getArraysStatsMap() {
    return arraysStatsMap;
  }
}
