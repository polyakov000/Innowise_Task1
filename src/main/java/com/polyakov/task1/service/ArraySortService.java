package com.polyakov.task1.service;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;

public interface ArraySortService {
  MyArray quickSort(MyArray myArray) throws EmptyArrayException;
  MyArray bubbleSort(MyArray myArray) throws EmptyArrayException;

}
