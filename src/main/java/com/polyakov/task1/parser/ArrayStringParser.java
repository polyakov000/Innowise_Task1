package com.polyakov.task1.parser;

import java.util.List;
import java.util.Optional;

public interface ArrayStringParser {
  int[] parse(String fileData);
  List<String> parseStream(List<String> fileData);
}
