package com.seligent.training.domain.Square;

import com.seligent.training.api.ShapeManager;


public class ShapeManagerSquare implements ShapeManager<Square> {
    public double calculateArea(Square r) {
        return r.getLength() * r.getLength();
    }

    public int getNumberOfSides(Square r) {
        return 4;
    }

    public String getTypeName(Square r) {
        return r.getClass().getSimpleName();
    }
}
