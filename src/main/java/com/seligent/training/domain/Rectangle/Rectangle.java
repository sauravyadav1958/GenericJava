package com.seligent.training.domain.Rectangle;

import com.seligent.training.api.Shape;

public class Rectangle implements Shape {

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public boolean isA2dShape() {
        return false;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }



}

