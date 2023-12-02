package Designpattern.Structural.Decorator;

public class UpgradeCar {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car c1 = new SportsCar(basicCar);
        Car c2 = new LuxuryCar(c1);

        c2.assemble();
    }
}

class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car");
    }
}

interface Car {
    public void assemble();

}

class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();

    }
}

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Luxury Features Added!");
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Sports Features Added!");
    }
}
