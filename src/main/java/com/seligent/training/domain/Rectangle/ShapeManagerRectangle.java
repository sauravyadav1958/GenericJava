package com.seligent.training.domain.Rectangle;

import com.seligent.training.api.ShapeManager;


public class ShapeManagerRectangle implements ShapeManager<Rectangle> {
    public double calculateArea(Rectangle r) {
        return r.getLength() * r.getBreadth();
    }

    public int getNumberOfSides(Rectangle r) {
        return 4;
    }

    public String getTypeName(Rectangle r) {
        return r.getClass().getSimpleName();
    }
}
