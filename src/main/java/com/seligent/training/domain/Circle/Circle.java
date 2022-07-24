package com.seligent.training.domain.Circle;

import com.seligent.training.api.Shape;

public class Circle implements Shape {

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public boolean isA2dShape() {
    return false;
  }

  public double getRadius() {
    return radius;
  }

}
