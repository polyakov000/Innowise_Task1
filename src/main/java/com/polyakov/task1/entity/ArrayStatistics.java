package com.polyakov.task1.entity;

public class ArrayStatistics {
  private int min;
  private int max;
  private int sum;
  private double averageValue;

  public ArrayStatistics(int min, int max, int sum, double averageValue) {
    this.min = min;
    this.max = max;
    this.sum = sum;
    this.averageValue = averageValue;
  }

  private ArrayStatistics() {
  }

  public int getMin() {
    return min;
  }

  public int getMax() {
    return max;
  }

  public int getSum() {
    return sum;
  }

  public double getAverageValue() {
    return averageValue;
  }
  @Override
  public String toString(){
    StringBuilder stringBuilder = new StringBuilder("ArrayStats:\n")
            .append("min: ").append(min).append("\n")
            .append("max: ").append(max).append("\n")
            .append("sum: ").append(sum).append("\n")
            .append("averageValue: ").append(averageValue).append("\n");
    return stringBuilder.toString();
  }

  public static Builder Builder() {
    return new ArrayStatistics().new Builder();
  }

  public class Builder {
    private int min;
    private int max;
    private int sum;
    private double averageValue;

    private Builder() {}

    public Builder min(int min) {
      this.min = min;
      return this;
    }

    public Builder max(int max) {
      this.max = max;
      return this;
    }

    public Builder sum(int sum) {
      this.sum = sum;
      return this;
    }

    public Builder averageValue(double averageValue) {
      this.averageValue = averageValue;
      return this;
    }

    public ArrayStatistics build() {
      ArrayStatistics.this.min = this.min;
      ArrayStatistics.this.max = this.max;
      ArrayStatistics.this.sum = this.sum;
      ArrayStatistics.this.averageValue = this.averageValue;
      return ArrayStatistics.this;
    }
  }
}
