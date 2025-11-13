package com.polyakov.task1.service;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.exception.CustomArrayException;

public interface ReplaceElementsByConditionService {
  CustomArray replace(CustomArray customArray) throws CustomArrayException;
  CustomArray replaceStream(CustomArray customArray) throws CustomArrayException;
}
