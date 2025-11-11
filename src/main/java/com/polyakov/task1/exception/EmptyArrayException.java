package com.polyakov.task1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmptyArrayException extends Exception{
  public EmptyArrayException() {
  }

  public EmptyArrayException(String message) {
    super(message);
  }

  public EmptyArrayException(String message, Throwable cause) {
    super(message, cause);
  }

  public EmptyArrayException(Throwable cause) {
    super(cause);
  }
}
