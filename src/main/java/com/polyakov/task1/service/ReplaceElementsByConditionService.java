package com.polyakov.task1.service;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;

public interface ReplaceElementsByConditionService {
  MyArray replace(MyArray myArray) throws EmptyArrayException;
}
