package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;

public interface ArrayOperationsService {
  double findAverageValue(CustomArray customArray) throws CustomArrayException;
  double findAverageValueStream(CustomArray customArray) throws CustomArrayException;
  int findMaxValue(CustomArray customArray) throws CustomArrayException;
  int findMaxValueStream(CustomArray customArray) throws CustomArrayException;
  int findMinValue(CustomArray customArray) throws CustomArrayException;
  int findMinValueStream(CustomArray customArray) throws CustomArrayException;
  int positiveCount(CustomArray customArray) throws CustomArrayException;
  int positiveCountStream(CustomArray customArray) throws CustomArrayException;
  int negativeCount(CustomArray customArray) throws CustomArrayException;
  int negativeCountStream(CustomArray customArray) throws CustomArrayException;
  int sum(CustomArray customArray) throws CustomArrayException;
  int sumStream(CustomArray customArray) throws CustomArrayException;

}
