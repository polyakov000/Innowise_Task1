package com.polyakov.task1.specification.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.specification.Specification;

public class ArrayLengthMoreThanSpecification implements Specification {
  int arrayLength;
  public ArrayLengthMoreThanSpecification(int length){
    this.arrayLength = length;
  }
  @Override
  public boolean isExists(CustomArray customArray) {
    return customArray.getLength() > arrayLength;
  }
}
