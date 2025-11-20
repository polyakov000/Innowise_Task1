package com.polyakov.task1.comparator;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.ArrayCalculationsService;
import com.polyakov.task1.service.impl.ArrayCalculationsServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class SumComparator implements Comparator<CustomArray> {
  private static final Logger log = LogManager.getLogger();

  @Override
  public int compare(CustomArray customArray1, CustomArray customArray2) {
    ArrayCalculationsService arrayCalculationsService = new ArrayCalculationsServiceImpl();
    int result;
    try {
      int sum1 = arrayCalculationsService.sum(customArray1);
      int sum2 = arrayCalculationsService.sum(customArray2);
      result = Integer.compare(sum1,sum2);
    } catch (CustomArrayException e) {
      log.error("Error during sum calculating:" + e.getCause());
      result = -1;
    }
    return result;
  }
}
