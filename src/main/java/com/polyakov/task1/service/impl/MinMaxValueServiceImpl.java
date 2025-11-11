package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.MinMaxValueService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinMaxValueServiceImpl implements MinMaxValueService {
    static final Logger log = LogManager.getLogger(MinMaxValueService.class);


    @Override
    public int findMaxValue(MyArray myArray) throws EmptyArrayException {
        if(myArray == null || myArray.getLength() == 0){
            throw new EmptyArrayException("Empty or not initialized array");
        }
            int max = myArray.getElements()[0];
            for (int value : myArray.getElements()) {
                if (value > max) {
                    max = value;
                }
            }
            log.info("Max array value was found: {}", max);
        return max;
    }

    @Override
    public int findMinValue(MyArray myArray) throws EmptyArrayException {
        if(myArray == null || myArray.getLength() == 0){
            throw new EmptyArrayException("Empty or not initialized array");
        }
        int min = myArray.getElements()[0];
        for(int value : myArray.getElements()){
            if(value < min){
                min = value;
            }
        }
        log.info("Min array value was found: {}", min);
        return min;
    }
}
