package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;

public interface ArraySortService {
  void selectionSort(CustomArray customArray) throws CustomArrayException;
  void bubbleSort(CustomArray customArray) throws CustomArrayException;
  void insertionSort(CustomArray customArray) throws CustomArrayException;
  void streamSort(CustomArray customArray) throws  CustomArrayException;

}
