package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;

public interface ArrayCalculationsService {
  double findAverageValue(CustomArray customArray) throws CustomArrayException;
  double findAverageValueStream(CustomArray customArray) throws CustomArrayException;
  int sum(CustomArray customArray) throws CustomArrayException;
  int sumStream(CustomArray customArray) throws CustomArrayException;
}
