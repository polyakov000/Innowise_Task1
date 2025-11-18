package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.observer.ArrayObserver;
import com.polyakov.task1.observer.impl.ArrayObserverImpl;
import com.polyakov.task1.service.ReplaceElementsByConditionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ReplaceElementsByConditionServiceImpl implements ReplaceElementsByConditionService, ArrayObserver {
  static final Logger log = LogManager.getLogger();
  @Override
  public CustomArray replace(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    for(int i = 0; i < customArray.getLength(); i++){
      if(customArray.getElements()[i]<0){
        customArray.getElements()[i] = -1;
      }else if(customArray.getElements()[i]>0){
        customArray.getElements()[i] = 1;
      }
    }
    update(customArray);
    log.info("Array elements were replaced");
    return customArray;
  }

  @Override
  public CustomArray replaceStream(CustomArray customArray) throws CustomArrayException {
    if(customArray == null || customArray.getLength() == 0){
      throw new CustomArrayException("Empty or not initialized array");
    }
    int[] replacedElements = Arrays.stream(customArray.getElements())
            .map(re -> re < 0 ? -1 : re > 0 ? 1 : re)
            .toArray();
    customArray.setElements(replacedElements);
    log.info("Array elements were replaced using StreamAPI");
    return customArray;
  }
  @Override
  public void update(CustomArray customArray) {
    ArrayObserver arrayObserver = new ArrayObserverImpl();
    arrayObserver.update(customArray);
  }
}
