package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.PositiveNegativeCountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNegativeCountServiceImplTest {
    static final PositiveNegativeCountService positiveNegativeCountService = new PositiveNegativeCountServiceImpl();
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
    void positiveCount() throws EmptyArrayException {
        int expected = 5;
        int actual = positiveNegativeCountService.positiveCount(myArray);
        assertEquals(expected,actual);
    }

    @Test
    void negativeCount() throws EmptyArrayException {
        int expected = 0;
        int actual = positiveNegativeCountService.negativeCount(myArray);
        assertEquals(expected,actual);
    }
}