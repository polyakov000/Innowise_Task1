package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.PositiveNegativeCountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PositiveNegativeCountServiceImpl implements PositiveNegativeCountService {
    static final Logger log = LogManager.getLogger(PositiveNegativeCountService.class);

    @Override
    public int positiveCount(MyArray myArray) throws EmptyArrayException {
        if(myArray == null || myArray.getLength() == 0){
            throw new EmptyArrayException("Empty or not initialized array");
        }
        int count = 0;
        for(int value : myArray.getElements()){
            if(value > 0){
                count++;
            }
        }
        log.info("Positive array elements were counted: {}", count);
        return count;
    }

    @Override
    public int negativeCount(MyArray myArray) throws EmptyArrayException {
        if(myArray == null || myArray.getLength() == 0){
            throw new EmptyArrayException("Empty or not initialized array");
        }
        int count = 0;
        for(int value : myArray.getElements()){
            if(value < 0){
                count++;
            }
        }
        log.info("Negative array elements were counted: {}", count);
        return count;
    }
}
