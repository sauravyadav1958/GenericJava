package com.seligent.training.main;

import com.seligent.training.domain.Circle.Circle;
import com.seligent.training.domain.Circle.ShapeManagerCircle;
import com.seligent.training.domain.Pentagon.ShapeManagerTrapezium;
import com.seligent.training.domain.Pentagon.Trapezium;
import com.seligent.training.domain.Rectangle.Rectangle;
import com.seligent.training.domain.Rectangle.ShapeManagerRectangle;
import com.seligent.training.domain.Square.ShapeManagerSquare;
import com.seligent.training.domain.Square.Square;
import com.seligent.training.api.ShapeManager;
import com.seligent.training.domain.Triangle.ShapeManagerTriangle;
import com.seligent.training.domain.Triangle.Triangle;

public class main {
    public static void main(String args[]){

        // ***********  Triangle Shape  ***********
        Triangle t = new Triangle(3, 4);
        System.out.println("Triangle isA2dShape: " + t.isA2dShape());
        System.out.println("Triangle Height: " + t.getHeight());
        System.out.println("Triangle Base: " + t.getBase());

        ShapeManager s = new ShapeManagerTriangle();
        System.out.println("Triangle Area: " + s.calculateArea(t));
        System.out.println("Triangle numberOfSides: " + s.getNumberOfSides(t));
        System.out.println("Triangle typeName: " + s.getTypeName(t) + "\n");


        // ***********  Rectangle Shape  ***********
        Rectangle r = new Rectangle(3, 4);
        System.out.println("Rectangle isA2dShape: " + r.isA2dShape());
        System.out.println("Rectangle Length: " + r.getLength());
        System.out.println("Rectangle Breadth: " + r.getBreadth());

        ShapeManager s1 = new ShapeManagerRectangle();
        System.out.println("Rectangle Area: " + s1.calculateArea(r));
        System.out.println("Rectangle numberOfSides: " + s1.getNumberOfSides(r));
        System.out.println("Rectangle typeName: " + s1.getTypeName(r) + "\n");


        // ***********  Square Shape  ***********
        Square sq = new Square(4);
        System.out.println("Square isA2dShape: " + sq.isA2dShape());
        System.out.println("Square Length: " + sq.getLength());

        ShapeManager s2 = new ShapeManagerSquare();
        System.out.println("Square Area: " + s2.calculateArea(sq));
        System.out.println("Square numberOfSides: " + s2.getNumberOfSides(sq));
        System.out.println("Square typeName: " + s2.getTypeName(sq) + "\n");


        // ***********  Trapezium Shape  ***********
        Trapezium tr = new Trapezium(4, 5, 7);
        System.out.println("Trapezium isA2dShape: " + tr.isA2dShape());
        System.out.println("Trapezium Height: " + tr.getHeight());
        System.out.println("Trapezium Base1: " + tr.getBase1());
        System.out.println("Trapezium Base2: " + tr.getBase2());

        ShapeManager s3 = new ShapeManagerTrapezium();
        System.out.println("Trapezium Area: " + s3.calculateArea(tr));
        System.out.println("Trapezium numberOfSides: " + s3.getNumberOfSides(tr));
        System.out.println("Trapezium typeName: " + s3.getTypeName(tr) + "\n");


        // ***********  Circle Shape  ***********
        Circle c = new Circle(2);
        System.out.println("Circle isA2dShape: " + c.isA2dShape());
        System.out.println("Circle Radius: " + c.getRadius());

        ShapeManager s4 = new ShapeManagerCircle();
        System.out.println("Circle Area: " + s4.calculateArea(c));
        System.out.println("Circle numberOfSides: " + s4.getNumberOfSides(c));
        System.out.println("Circle typeName: " + s4.getTypeName(c) + "\n");




    }
}
