package io.prediction.engines.java.recommendations;

import java.io.Serializable;

public class Query implements Serializable {
  public int uid; // user ID
  public int iid; // item ID

  public Query(int uid, int iid) {
    this.uid = uid;
    this.iid = iid;
  }

  @Override
  public String toString() {
    return "(" + uid + "," + iid + ")";
  }
}
