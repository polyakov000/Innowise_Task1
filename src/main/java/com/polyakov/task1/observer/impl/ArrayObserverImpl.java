package com.polyakov.task1.observer.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.stats.ArrayStats;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.observer.ArrayObserver;
import com.polyakov.task1.service.ArrayOperationsService;
import com.polyakov.task1.service.impl.ArrayOperationsServiceImpl;
import com.polyakov.task1.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayObserverImpl implements ArrayObserver {
  static final Logger log = LogManager.getLogger();
  @Override
  public void update(CustomArray customArray) {
    final ArrayOperationsService arrayOperationsService = new ArrayOperationsServiceImpl();
    ArrayStats arrayStats =  ArrayStats.build().build();
    try {
      arrayStats = ArrayStats.build()
              .max(arrayOperationsService.findMaxValue(customArray))
              .min(arrayOperationsService.findMinValue(customArray))
              .sum(arrayOperationsService.sum(customArray))
              .averageValue(arrayOperationsService.findAverageValue(customArray))
              .build();
    } catch (CustomArrayException e) {
      log.error("Error during warehouse updating");
    }
    Warehouse warehouse = Warehouse.getInstance();
    warehouse.putStats(customArray.getId(),arrayStats);
  }
}
