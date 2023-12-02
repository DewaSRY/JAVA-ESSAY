package Designpattern.Structural.Bridge;

import java.util.Random;

public class ColoringShape {
    static String[] shapeNames = new String[] {
            "circle",
            "rectangle",
            "Renumbers",
            "threeAngle",
            "Square",
    };
    static String[] colorNames = new String[] {
            "red",
            "green",
            "blue",

    };

    static Random randomNum = new Random();

    static private String getShapeName() {
        return shapeNames[randomNum.nextInt(shapeNames.length - 1)];
    }

    static private String getShapeColor() {
        return colorNames[randomNum.nextInt(colorNames.length - 1)];
    }

    public static void main(String[] args) {

        Shape[] allShapes = new Shape[] {
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
                new ShapeMaker(getShapeName(), new AddColor(getShapeColor())),
        };
        for (var shape : allShapes) {
            shape.applyColorToShape();
        }
        System.out.println();
    }
}

interface Color {
    void applyColor();
}

abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColorToShape();

}

class AddColor implements Color {
    private String colorName;

    public AddColor(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void applyColor() {
        System.out.print("add color : " + this.colorName + " ");
    }
}

class ShapeMaker extends Shape {
    private String shapeName;

    public ShapeMaker(String shapeName, Color color) {
        super(color);
        this.shapeName = shapeName;

    }

    @Override
    public void applyColorToShape() {
        color.applyColor();
        System.out.println(this.shapeName + " filled with color ");
    }
}
