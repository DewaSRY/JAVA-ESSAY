package Designpattern.Behavioral.Flyweight;

import java.util.HashMap;

public class Shapes {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(20);
            circle.draw();
        }

    }

    private static String getRandomColor() {
        final String colors[] = {
                "Red",
                "Yellow",
                "Blue",
                "Green",
                "Purple"
        };

        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}

interface Shape {
    void draw();
}

class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of Color: " + color);
        }
        return circle;

    }
}

class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: color" +
                color + " x: " + x + " y: " + y +
                " radius: " + radius);
    }
}