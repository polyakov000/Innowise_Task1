package com.polyakov.task1.reader;

import com.polyakov.task1.exception.CustomFileException;
import com.polyakov.task1.reader.impl.CustomFileReaderImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomFileReaderImplTest {
  static final String relPath = "data/input.txt";
  static final CustomFileReader customFileReader = new CustomFileReaderImpl();

  @BeforeEach
  void setUp() {}

  @AfterEach
  void tearDown() {}

  @Test
  void readFile() throws CustomFileException {
    List<String> expected = Arrays.asList("1 2 3 4","22 33 44","1 2 3 4","22 33 44","","e 2 3 4","e1 2 3 4");
    List<String> actual = customFileReader.readFile(relPath);
    assertEquals(expected,actual);
  }
}