package com.polyakov.task1.repository.specification.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.repository.specification.Specification;

public class FirstArrayElementSpecification implements Specification {
  int element;

  public FirstArrayElementSpecification(int element) {
    this.element = element;
  }

  @Override
  public boolean isExists(CustomArray customArray) {
    return customArray.getElements()[0] == element;
  }
}
