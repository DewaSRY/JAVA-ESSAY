package Designpattern.Creation.AbstractFactory;

public class AbstractShapeFactory {
    public static void main(String[] args) {
        System.out.println();
        AbstractFactory normalShapeFactory = FactoryProducer.getFactory(false);
        Shape s1 = normalShapeFactory.getShape("Rectangle");
        s1.drawShape();

        // Rounded Shapes
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape s2 = roundedShapeFactory.getShape("Rectangle");
        s2.drawShape();
    }
}

// The Factory of Factories
// The Factory of Factories
abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}

class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

class Rectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Rectangle");
    }
}

class RoundedRectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Rounded Rectangle");
    }
}

class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}

class RoundedSquare implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Rounded Square");
    }
}

interface Shape {
    void drawShape();
}

class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;

    }
}

class Square implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Square");
    }
}
