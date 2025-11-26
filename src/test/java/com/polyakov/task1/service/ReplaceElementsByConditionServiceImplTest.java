package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;
import com.polyakov.task1.service.impl.ReplaceElementsByConditionServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReplaceElementsByConditionServiceImplTest {
  static final ReplaceElementsByConditionService replaceElementsByConditionService = new ReplaceElementsByConditionServiceImpl();
  CustomArray customArray;
  @BeforeEach
  void setUp() {
    customArray = new CustomArray(1,new int[]{-3,-2,0,4,5});
  }

  @AfterEach
  void tearDown() {}

  @Test
  void replace() throws CustomArrayException {
    CustomArray modifiedArray = replaceElementsByConditionService.replace(customArray);
    int[] expected = {-1,-1,0,1,1};
    int[] actual = modifiedArray.getElements();
    assertArrayEquals(expected,actual);
  }
  @Test
  void replaceStream() throws CustomArrayException {
    CustomArray modifiedArray = replaceElementsByConditionService.replaceStream(customArray);
    int[] expected = {-1,-1,0,1,1};
    int[] actual = modifiedArray.getElements();
    assertArrayEquals(expected,actual);
  }
}