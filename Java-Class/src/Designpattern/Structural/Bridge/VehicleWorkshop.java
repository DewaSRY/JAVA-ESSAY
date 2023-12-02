package Designpattern.Structural.Bridge;

public class VehicleWorkshop {
    public static void main(String[] args) {
        Vehicle BUGATTIFactory = new LUXURYCarFactory("BUGATI", new Workshop[] {
                new Produce(10),
                new Paint("Red")
        });
        BUGATTIFactory.manufacture();
    }
}

abstract class Vehicle {

    private Workshop[] worKShopProcedure;

    public Vehicle(Workshop[] worKShopProcedure) {
        this.worKShopProcedure = worKShopProcedure;
    }

    public void manufacture() {
        for (Workshop process : this.worKShopProcedure) {
            process.work();
        }
    }
}

interface Workshop {
    void work();
}

class Produce implements Workshop {
    private int amountProduction;

    public Produce(int amountProduction) {
        this.amountProduction = amountProduction;
    }

    @Override
    public void work() {
        System.out.print(" Produced : " + this.amountProduction);
    }
}

class Paint implements Workshop {
    private String color;

    public Paint(String color) {
        this.color = color;
    }

    @Override
    public void work() {
        System.out.print(" Painted " + this.color);
    }
}

class LUXURYCarFactory extends Vehicle {
    private String carName;

    public LUXURYCarFactory(String carName, Workshop[] worKShopProcedure) {
        super(worKShopProcedure);
        this.carName = carName;

    }

    @Override
    public void manufacture() {
        System.out.print("Make " + this.carName + " ");
        super.manufacture();

    }
}
