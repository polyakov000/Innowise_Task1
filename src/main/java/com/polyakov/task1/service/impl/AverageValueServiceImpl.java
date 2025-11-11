package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.AverageValueService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageValueServiceImpl implements AverageValueService {
    static final Logger log = LogManager.getLogger(AverageValueService.class);
    @Override
    public double findAverageValue(MyArray myArray) throws EmptyArrayException {
        if(myArray == null || myArray.getLength() == 0){
            throw new EmptyArrayException("Empty or not initialized array");
        }
        int sum = 0;
        int length = myArray.getLength();
        for (int value : myArray.getElements()){
            sum += value;
        }
        log.info("Average array value counted: {}",(double) sum/length);
        return (double) sum/length;
    }
}
