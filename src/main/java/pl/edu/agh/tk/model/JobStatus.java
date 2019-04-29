package pl.edu.agh.tk.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum JobStatus {
  RUNNING("running"),
    DONE("done"),
    CANCELLED("cancelled"),
    ERROR("error");

  private String value;

  JobStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static JobStatus fromValue(String text) {
    for (JobStatus b : JobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
