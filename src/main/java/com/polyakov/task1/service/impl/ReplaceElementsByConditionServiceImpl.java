package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.ReplaceElementsByConditionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReplaceElementsByConditionServiceImpl implements ReplaceElementsByConditionService {
  static final Logger log = LogManager.getLogger(ReplaceElementsByConditionService.class);
  @Override
  public MyArray replace(MyArray myArray) throws EmptyArrayException {
    if(myArray == null || myArray.getLength() == 0){
      throw new EmptyArrayException("Empty or not initialized array");
    }
    for(int i = 0; i < myArray.getLength(); i++){
      if(myArray.getElements()[i]<0){
        myArray.getElements()[i] = -1;
      }else if(myArray.getElements()[i]>0){
        myArray.getElements()[i] = 1;
      }
    }
    log.info("Array elements were replaced");
    return myArray;
  }

}
