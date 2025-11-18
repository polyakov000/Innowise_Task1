package com.polyakov.task1.warehouse;

import com.polyakov.task1.stats.ArrayStats;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  static Warehouse warehouse;
  static Map<Long, ArrayStats> arraysStatsMap = new HashMap<>();

  private Warehouse(){
  }
  public static Warehouse getInstance(){
    if(warehouse == null){
      warehouse = new Warehouse();
    }
    return warehouse;
  }
  public void putStats(long id, ArrayStats arrayStats){
    arraysStatsMap.put(id,arrayStats);
  }

  public void clearWarehouse(){
    arraysStatsMap.clear();
  }

  public static Map<Long, ArrayStats> getArraysStatsMap() {
    return arraysStatsMap;
  }
}
