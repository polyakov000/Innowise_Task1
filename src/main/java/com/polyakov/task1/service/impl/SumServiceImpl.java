package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.SumService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumServiceImpl implements SumService {
    static final Logger log = LogManager.getLogger(SumService.class);
    @Override
    public double sum(MyArray myArray) throws EmptyArrayException {
        if(myArray == null || myArray.getLength() == 0){
            throw new EmptyArrayException("Empty or not initialized array");
        }
        int sum = 0;
        for (int value : myArray.getElements()){
            sum+=value;
        }
        log.info("Array elements sum was counted: {}", sum);
        return sum;
    }
}
