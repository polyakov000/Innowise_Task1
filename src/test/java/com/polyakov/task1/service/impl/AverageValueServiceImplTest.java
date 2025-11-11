package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.AverageValueService;
import com.polyakov.task1.service.SumService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueServiceImplTest {
    static final AverageValueService averageValueService = new AverageValueServiceImpl();
    static final MyArray myArray = new MyArray(1,new int[]{1,2,3,4,5});
    static final Logger log = LogManager.getLogger();


    @BeforeEach
    void setUp(TestInfo testInfo) {
        log.info("{} started", testInfo.getDisplayName());
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        log.info("{} ended", testInfo.getDisplayName());
    }

    @Test
    void findAverageValue() throws EmptyArrayException {
        double expected = 3;
        double actual = averageValueService.findAverageValue(myArray);
        assertEquals(expected,actual);
    }
}