package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySortServiceImpl implements ArraySortService {
  static final Logger log = LogManager.getLogger();
  @Override
  public CustomArray selectionSort(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    for (int i = 0; i < customArray.getElements().length; i++) {
      int pos = i;
      int min = customArray.getElements()[i];
      for (int j = i + 1; j < customArray.getElements().length; j++) {
        if (customArray.getElements()[j] < min) {
          pos = j;
          min = customArray.getElements()[j];
        }
      }
      customArray.getElements()[pos] = customArray.getElements()[i];
      customArray.getElements()[i] = min;
    }
    log.info("{} was sorted by selectionSort", customArray);
    return customArray;
  }

  @Override
  public CustomArray bubbleSort(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    for (int i = 0; i < customArray.getElements().length - 1; i++) {
      for(int j = 0; j < customArray.getElements().length - i - 1; j++) {
        if(customArray.getElements()[j + 1] < customArray.getElements()[j]) {
          int swap = customArray.getElements()[j];
          customArray.getElements()[j] = customArray.getElements()[j + 1];
          customArray.getElements()[j + 1] = swap;
        }
      }
    }
    log.info("{} was sorted by bubbleSort", customArray);
    return customArray;
  }

  @Override
  public CustomArray insertionSort(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int j;
    for (int i = 1; i < customArray.getElements().length; i++) {
      int swap = customArray.getElements()[i];
      for (j = i; j > 0 && swap < customArray.getElements()[j - 1]; j--) {
        customArray.getElements()[j] = customArray.getElements()[j - 1];
      }
      customArray.getElements()[j] = swap;
    }
    log.info("{} was sorted by insertionSort", customArray);
    return customArray;
  }

  @Override
  public CustomArray streamSort(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int[] sortedElements = Arrays.stream(customArray.getElements())
            .sorted()
            .toArray();
    customArray.setElements(sortedElements);
    log.info("{} was sorted by streamSort", customArray);
    return customArray;
  }
}
