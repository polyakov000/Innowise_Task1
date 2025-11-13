package com.polyakov.task1.parser;

import java.util.List;

public interface FileDataParser  {
  List<String> parse(List<String> fileData);
  List<String> parseStream(List<String> fileData);
}
