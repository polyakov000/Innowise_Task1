package com.polyakov.task1.service.impl;

import com.polyakov.task1.entity.MyArray;
import com.polyakov.task1.exception.EmptyArrayException;
import com.polyakov.task1.service.MinMaxValueService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxValueServiceImplTest {
    static final MinMaxValueService minMaxValueService = new MinMaxValueServiceImpl();
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
    void findMaxValue() throws EmptyArrayException {
        int expected = 5;
        int actual = minMaxValueService.findMaxValue(myArray);
        assertEquals(expected,actual);
    }

    @Test
    void findMinValue() throws EmptyArrayException {
        int expected = 1;
        int actual = minMaxValueService.findMinValue(myArray);
        assertEquals(expected, actual);
    }
}