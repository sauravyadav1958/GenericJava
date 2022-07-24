package com.seligent.training.domain.Triangle;

import com.seligent.training.api.ShapeManager;

public class ShapeManagerTriangle implements ShapeManager<Triangle> {
    public double calculateArea(Triangle t) {
        return (t.getHeight() * t.getBase())/2;
    }

    public int getNumberOfSides(Triangle t) {
        return 3;
    }

    public String getTypeName(Triangle t) {
        return t.getClass().getSimpleName();
    }
}
