package com.seligent.training.domain.Pentagon;

import com.seligent.training.api.ShapeManager;


public class ShapeManagerTrapezium implements ShapeManager<Trapezium> {
    public double calculateArea(Trapezium r) {
        return 0.5 * (r.getBase1() + r.getBase2()) * r.getHeight();
    }

    public int getNumberOfSides(Trapezium r) {
        return 4;
    }

    public String getTypeName(Trapezium r) {
        return r.getClass().getSimpleName();
    }
}
