package io.prediction.engines.java.recommendations;

import io.prediction.controller.Params;

public class DataSourceParams implements Params {
  public String filePath; // file path

  public DataSourceParams(String path) {
    this.filePath = path;
  }
}
