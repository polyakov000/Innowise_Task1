package com.polyakov.task1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmptyArrayException extends Exception{
  static final Logger log = LogManager.getLogger();
  public EmptyArrayException() {
  }

  public EmptyArrayException(String message) {
    super(message);
    log.error(message);
  }

}
