package com.polyakov.task1.validator.impl;

import com.polyakov.task1.validator.ArrayStringValidator;
import java.util.regex.Pattern;

public class ArrayStringValidatorImpl implements ArrayStringValidator {
  static final Pattern STRING_PATTERN = Pattern.compile("^(?=.*\\d)[\\d\\s]+$");
  @Override
  public boolean isValid(String string) {
      return STRING_PATTERN.matcher(string).matches();
  }

  @Override
  public boolean isValidStream(String string) {
    return false;
  }
}
