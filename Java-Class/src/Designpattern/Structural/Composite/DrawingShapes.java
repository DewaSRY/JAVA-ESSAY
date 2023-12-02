package Designpattern.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class DrawingShapes {
    public static void main(String[] args) {
        Shape tri1 = new Triangle("Blue");
        Shape tri2 = new Triangle("Yellow");
        Shape circle = new Circle("Green");

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri2);
        drawing.add(circle);

        drawing.draw("Red");
    }
}

interface Shape {
    void draw(String fillColor);
}

class Triangle implements Shape {
    String initColor;

    public Triangle(String initColor) {
        this.initColor = initColor;
        System.out.println("Creating Triangle with Color: " + initColor);
    }

    @Override
    public void draw(String fillColor) {

        System.out.println("Drawing Triangle with Color: " + fillColor);
    }
}

class Drawing implements Shape {
    // Collection of Shapes
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape s) {
        this.shapes.add(s);
    }

    public void remove(Shape s) {
        this.shapes.remove(s);
    }

    public void clear() {
        this.shapes.clear();
        System.out.println("Removing all the shapes from Drawing!");
    }

    @Override
    public void draw(String fillColor) {
        for (Shape sh : shapes) {
            sh.draw(fillColor);
        }
    }
}

class Circle implements Shape {
    String initColor;

    public Circle(String initColor) {
        this.initColor = initColor;
        System.out.println("Creating Circle with Color: " + initColor);
    }

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color: " + fillColor);
    }
}
