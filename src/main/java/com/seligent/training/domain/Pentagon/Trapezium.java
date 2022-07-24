package com.seligent.training.domain.Pentagon;

import com.seligent.training.api.Shape;

public class Trapezium implements Shape {

    private final double base1;
    private final double base2;
    private final double height;

    public Trapezium(double height, double base1, double base2) {
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }
    public boolean isA2dShape() {
        return false;
    }

    public double getHeight() {
        return height;
    }

    public double getBase1() {
        return base1;
    }
    public double getBase2() {
        return base2;
    }

}

