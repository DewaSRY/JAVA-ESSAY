package Designpattern.Creation.Factory;

public class ShapeMaker {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("rectangle");
        s1.drawShape();
    }
}

interface Shape {
    void drawShape();
}

class Circle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a Rectangle");
    }
}

class RoundedCircle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a Rounded Circle");
    }
}

class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Rounded Circle")) {
            return new RoundedCircle();
        }
        return null;

    }
}

class Square implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a Square");
    }
}
