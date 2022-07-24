package com.seligent.training.domain.Circle;

import com.seligent.training.api.ShapeManager;

public class ShapeManagerCircle implements ShapeManager<Circle> {
    public double calculateArea(Circle t) {
        return t.getRadius() * t.getRadius() * Math.PI;
    }

    public int getNumberOfSides(Circle t) {
        return 1;
    }

    public String getTypeName(Circle t) {
        return t.getClass().getSimpleName();
    }
}
