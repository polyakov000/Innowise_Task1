package com.polyakov.task1.reader;

import com.polyakov.task1.exception.CustomFileException;
import com.polyakov.task1.reader.impl.CustomFileReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomFileReaderImplTest {
  static final Logger log = LogManager.getLogger();
  static final String relPath = "data/input.txt";
  static final CustomFileReader customFileReader = new CustomFileReaderImpl();

  @BeforeEach
  void setUp(TestInfo testInfo) {
    log.info("{} started", testInfo.getDisplayName());
  }

  @AfterEach
  void tearDown(TestInfo testInfo) {
    log.info("{} ended", testInfo.getDisplayName());
  }

  @Test
  void readFile() throws CustomFileException {
    List<String> expected = Arrays.asList("1 2 3 4","22 3e3 44","","e 2 3 4","e1 2 3 4");
    List<String> actual = customFileReader.readFile(relPath);
    assertEquals(expected,actual);
  }
}