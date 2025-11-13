package com.polyakov.task1.validator.impl;

import com.polyakov.task1.validator.DataValidator;
import java.util.regex.Pattern;

public class DataValidatorImpl implements DataValidator {
  static final Pattern NUMBER_PATTERN = Pattern.compile("^-?\\d+$");
  @Override
  public boolean isValid(String string) {
      return NUMBER_PATTERN.matcher(string).matches();
  }

  @Override
  public boolean isValidStream(String string) {
    return false;
  }
}
