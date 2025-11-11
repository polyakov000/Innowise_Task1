package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.ArraySortService;
import com.polyakov.task1.service.AverageValueService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {
  static final Logger log = LogManager.getLogger(AverageValueService.class);
  @Override
  public MyArray quickSort(MyArray myArray) throws EmptyArrayException {
    if(myArray == null || myArray.getLength() == 0){
      throw new EmptyArrayException("Empty or not initialized array");
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public MyArray bubbleSort(MyArray myArray) throws EmptyArrayException {
    if(myArray == null || myArray.getLength() == 0){
      throw new EmptyArrayException("Empty or not initialized array");
    }
    throw new UnsupportedOperationException();
  }
}
