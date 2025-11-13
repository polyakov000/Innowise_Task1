package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;

public interface ArraySortService {
  CustomArray selectionSort(CustomArray customArray) throws CustomArrayException;
  CustomArray bubbleSort(CustomArray customArray) throws CustomArrayException;
  CustomArray insertionSort(CustomArray customArray) throws CustomArrayException;
  CustomArray streamSort(CustomArray customArray) throws  CustomArrayException;

}
