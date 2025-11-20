package com.polyakov.task1.observer.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.service.ArrayCalculationsService;
import com.polyakov.task1.service.impl.ArrayCalculationsServiceImpl;
import com.polyakov.task1.entity.ArrayStatistics;
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
    ArrayOperationsService arrayOperationsService = new ArrayOperationsServiceImpl();
    ArrayCalculationsService arrayCalculationsService = new ArrayCalculationsServiceImpl();
    try {
      int maxValue = arrayOperationsService.findMaxValue(customArray);
      int minValue = arrayOperationsService.findMinValue(customArray);
      int sum = arrayCalculationsService.sum(customArray);
      double averageValue = arrayCalculationsService.calculateAverageValue(customArray);

      ArrayStatistics arrayStatistics = ArrayStatistics.Builder()
              .max(maxValue)
              .min(minValue)
              .sum(sum)
              .averageValue(averageValue)
              .build();

      Warehouse warehouse = Warehouse.getInstance();
      warehouse.put(customArray.getId(), arrayStatistics);
    } catch (CustomArrayException e) {
      log.error("Error during CustomArray parameters calculations", e);
    }
  }

}
