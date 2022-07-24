package com.seligent.training.domain.Square;

import com.seligent.training.api.Shape;

public class Square implements Shape {

    private final double length;

    public Square(double length) {
        this.length = length;
    }
    public boolean isA2dShape() {
        return false;
    }

    public double getLength() {
        return length;
    }
}

