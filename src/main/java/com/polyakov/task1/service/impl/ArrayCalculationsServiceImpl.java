package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.ArrayCalculationsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Optional;

public class ArrayCalculationsServiceImpl implements ArrayCalculationsService {
  static final Logger log = LogManager.getLogger();
  public double calculateAverageValue(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int sum = 0;
    int length = customArray.getLength();
    for (int value : customArray.getElements()){
      sum += value;
    }
    log.info("Average array value counted: {}",(double) sum/length);
    return (double) sum/length;
  }

  @Override
  public double calculateAverageValueStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int length = customArray.getLength();
    int sum = Arrays.stream(customArray.getElements())
            .sum();
    log.info("Average array value counted using StreamAPI: {}",(double) sum/length);
    return (double) sum/length;
  }
  @Override
  public int sum(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int sum = 0;
    for (int value : customArray.getElements()){
      sum+=value;
    }
    log.info("Array elements sum was counted: {}", sum);
    return sum;
  }

  @Override
  public int sumStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int sum = Arrays.stream(customArray.getElements())
            .sum();
    log.info("Array elements sum was counted using StreamAPI: {}", sum);
    return sum;
  }
}
