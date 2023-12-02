package Designpattern.Creation.Prototype;

public class Points {
    public static void main(String[] args) {
        System.out.println();
        Shape s1 = new Point(1, 3);

        // Cloning s1
        Shape s2 = s1.clone();

        System.out.println(s1.getTx());
        System.out.println(s2.getTx());
    }
}

class Point extends Shape {

    public Point(int x, int y) {
        super(x, y);
    }

    // Cloning the object
    @Override
    public Shape clone() {
        return new Point(this.x, this.y) {
        };
    }
}

abstract class Shape {
    int x;
    int y;

    int tx;
    int ty;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.tx = 3 + x;
        this.ty = 2 + y;
    }

    public int getTx() {
        return tx;
    }

    public int getTy() {
        return ty;
    }

    public abstract Shape clone();
}
