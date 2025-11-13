package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.impl.ReplaceElementsByConditionServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReplaceElementsByConditionServiceImplTest {
  static final ReplaceElementsByConditionService replaceElementsByConditionService = new ReplaceElementsByConditionServiceImpl();
  static final CustomArray CUSTOM_ARRAY = new CustomArray(1,new int[]{-3,-2,0,4,5});
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
  void replace() throws CustomArrayException {
    CustomArray modifiedArray = replaceElementsByConditionService.replace(CUSTOM_ARRAY);
    int[] expected = {-1,-1,0,1,1};
    int[] actual = modifiedArray.getElements();
    assertArrayEquals(expected,actual);
  }
  @Test
  void replaceStream() throws CustomArrayException {
    CustomArray modifiedArray = replaceElementsByConditionService.replaceStream(CUSTOM_ARRAY);
    int[] expected = {-1,-1,0,1,1};
    int[] actual = modifiedArray.getElements();
    assertArrayEquals(expected,actual);
  }
}