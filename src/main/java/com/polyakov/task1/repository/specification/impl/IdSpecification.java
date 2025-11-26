package com.polyakov.task1.repository.specification.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.repository.specification.Specification;

public class IdSpecification implements Specification {
  long id;
  public IdSpecification(long id){
    this.id = id;
  }
  @Override
  public boolean isExists(CustomArray customArray) {
    return customArray.getId() == id;
  }
}
