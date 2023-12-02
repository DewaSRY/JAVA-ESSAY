package Designpattern.Structural.Adapter;

public class GeometricShapes {
    public static void main(String[] args) {
        System.out.println("hallo world");

        Shape[] shapesArray = new Shape[] {
                new Circle(4),
                new Circle(5),
                new Rectangle(5, 4),
                new Rectangle(5, 9),
                new GeometryShape(new Renumbers(40, 5)),
                new GeometryShape(new Renumbers(4, 15)),
                new GeometryShape(new Renumbers(4, 25)),
                new GeometryShape(new Triangle(5, 40, 5)),
                new GeometryShape(new Triangle(10, 4, 15)),
                new GeometryShape(new Triangle(8, 4, 25)),
        };
        for (Shape s : shapesArray) {
            s.resize();
            s.draw();
        }
    }
}

interface Shape {
    void draw();

    void resize();

    String description();

    boolean isHide();

}

class Rectangle implements Shape {
    private double width;
    private double hight;

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;

    }

    @Override
    public void draw() {
        System.out.println(this.description());
    }

    @Override
    public void resize() {
        this.width *= 2;
        this.hight *= 2;
    }

    @Override
    public String description() {
        return "%-10s size si %-10.2f ".formatted(this.getClass().getName(), this.width * this.hight);
    }

    @Override
    public boolean isHide() {
        return this.width * this.hight > 0;
    }

}

class Circle implements Shape {
    private double radios;

    public Circle(double radios) {
        this.radios = radios;

    }

    @Override
    public void draw() {
        System.out.println(this.description());
    }

    @Override
    public void resize() {
        this.radios += 2;

    }

    @Override
    public String description() {
        double area = Math.pow(this.radios, 2) * Math.PI;

        return "%-10.10s size si %-10.2f ".formatted(this.getClass().getName(), area);
    }

    @Override
    public boolean isHide() {
        return this.radios > 0;
    }

}

interface Geometry {
    double area();

    double parameter();

    void drawShape();
}

class Triangle implements Geometry {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (this.a + this.b + this.c) / 2;

        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }

    @Override
    public double parameter() {
        return (this.a + this.b + this.c);
    }

    @Override
    public void drawShape() {

        System.out.printf("%-10s area:  %-15.2f parameter : %-15.2f ", this.getClass().getName(), this.area(),
                this.parameter());

    }

}

class Renumbers implements Geometry {
    private double diagonalOne;
    private double diagonalTwo;

    public Renumbers(double diagonalOne, double diagonalTwo) {
        this.diagonalOne = diagonalOne;
        this.diagonalTwo = diagonalTwo;

    }

    @Override
    public double area() {
        return this.diagonalOne * this.diagonalTwo;
    }

    @Override
    public double parameter() {
        return (this.diagonalOne + this.diagonalTwo) * 2;
    }

    @Override
    public void drawShape() {
        System.out.printf("%-10s area:  %-15.2f parameter : %-15.2f ", this.getClass().getName(), this.area(),
                this.parameter());
    }

}

class GeometryShape implements Shape {

    private Geometry shapeObject;

    public GeometryShape(Geometry shapeObject) {
        this.shapeObject = shapeObject;
    }

    @Override
    public void draw() {
        this.shapeObject.drawShape();
        System.out.println(this.description());
    }

    @Override
    public void resize() {
        System.out.printf("%-15s can be resize", this.description());

    }

    @Override
    public String description() {
        return this.shapeObject.getClass().getName();

    }

    @Override
    public boolean isHide() {
        return this.shapeObject.area() > 0;
    }

}