package Designpattern.Structural.Adapter;

public class VehicleSpeed {

    public static void main(String[] args) {

        System.out.println("Europa sped stander one ---");

        Vehicle[] cars = new Vehicle[] {
                new BUGATTI(),
                new PORSCHE(),
                new MASERATI()
        };

        for (var car : cars) {
            System.out.println(car);
        }
        System.out.println("Arab sped stander one ---");
        for (var car : cars) {
            System.out.println(new ArabSpeedAdapterOne(car));
        }

    }
}

class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "%-8s".formatted(this.brand);
    }
}

class MASERATI extends Vehicle {

    public MASERATI() {
        super("MASERATI", 200);
    }

    @Override
    public String toString() {

        return "%s  %-5d m/h".formatted(super.toString(), this.getSpeed());
    }
}

class PORSCHE extends Vehicle {

    public PORSCHE() {
        super("PORSCHE", 200);
    }

    @Override
    public String toString() {

        return "%s  %-5d m/h".formatted(super.toString(), this.getSpeed());
    }
}

class BUGATTI extends Vehicle {

    public BUGATTI() {
        super("BUGATTI", 200);
    }

    @Override
    public String toString() {

        return "%s  %-5d m/h".formatted(super.toString(), this.getSpeed());
    }
}

class ArabSpeedAdapterOne {
    private Vehicle car;

    public ArabSpeedAdapterOne(Vehicle car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "%s %-5.2f km/h".formatted(car.getBrand(), car.getSpeed() * 1.6);
    }

}