package com.seligent.training.domain.Triangle;

import com.seligent.training.api.Shape;

public class Triangle implements Shape {

  private final double height;
  private final double base;

  public Triangle(double height, double base) {
    this.height = height;
    this.base = base;
  }

  public boolean isA2dShape() {
    return false;
  }

  public double getHeight() {
    return height;
  }

  public double getBase() {
    return base;
  }
}
