package com.polyakov.task1.stats;

public class ArrayStats {
  private int min;
  private int max;
  private int sum;
  private double averageValue;

  public ArrayStats(int min, int max, int sum, double averageValue) {
    this.min = min;
    this.max = max;
    this.sum = sum;
    this.averageValue = averageValue;
  }

  private ArrayStats() {
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

  public static Builder build() {
    return new ArrayStats().new Builder();
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

    public ArrayStats build() {
      ArrayStats.this.min = this.min;
      ArrayStats.this.max = this.max;
      ArrayStats.this.sum = this.sum;
      ArrayStats.this.averageValue = this.averageValue;
      return ArrayStats.this;
    }
  }
}
