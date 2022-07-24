package com.seligent.training.api;

public interface ShapeManager<T extends Shape> {

  double calculateArea(T t);

  int getNumberOfSides(T t);

  String getTypeName(T t);
}
