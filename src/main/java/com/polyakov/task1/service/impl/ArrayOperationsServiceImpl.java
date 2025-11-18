package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.ArrayOperationsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayOperationsServiceImpl implements ArrayOperationsService {
  static final Logger log = LogManager.getLogger();
  @Override
  public int findMaxValue(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int max = customArray.getElements()[0];
    for (int value : customArray.getElements()) {
      if (value > max) {
        max = value;
      }
    }
    log.info("Max array value was found: {}", max);
    return max;
  }

  @Override
  public int findMaxValueStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int max = Arrays.stream(customArray.getElements())
            .max()
            .getAsInt();
    log.info("Max array value was found using StreamAPI: {}", max);
    return max;
  }

  @Override
  public int findMinValue(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int min = customArray.getElements()[0];
    for(int value : customArray.getElements()){
      if(value < min){
        min = value;
      }
    }
    log.info("Min array value was found: {}", min);
    return min;
  }

  @Override
  public int findMinValueStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int min = Arrays.stream(customArray.getElements())
            .min()
            .getAsInt();
    log.info("Min array value was found using StreamAPI: {}", min);
    return min;
  }

  @Override
  public int positiveCount(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int count = 0;
    for(int value : customArray.getElements()){
      if(value > 0){
        count++;
      }
    }
    log.info("Positive array elements were counted: {}", count);
    return count;
  }

  @Override
  public int positiveCountStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int count = (int) Arrays.stream(customArray.getElements())
            .filter(element -> element > 0)
            .count();
    log.info("Positive array elements were counted using StreamAPI: {}", count);
    return count;
  }

  @Override
  public int negativeCount(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int count = 0;
    for(int value : customArray.getElements()){
      if(value < 0){
        count++;
      }
    }
    log.info("Negative array elements were counted: {}", count);
    return count;
  }

  @Override
  public int negativeCountStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int count = (int) Arrays.stream(customArray.getElements())
            .filter(element -> element < 0)
            .count();
    log.info("Negative array elements were counted using StreamAPI: {}", count);
    return count;
  }
}
