

package Abstraction;


record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOf() {
        throw new UnsupportedOperationException("Unimplemented method 'takeOf'");
    }

    @Override
    public void land() {
        throw new UnsupportedOperationException("Unimplemented method 'land'");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}

enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION,;

    @Override
    public void track() {
        if (this != GROUNDED) {
        System.out.println("Monitoring "+ this);
       }
    }
    
}

public class InterfaceL {

    public static void run() {

    }
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    
    void takeOf();

    void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
        System.out.println("Transition no implemented on " + this.getClass().getName());
        return null;
    }
}
interface Trackable {
    void track();
}

abstract class Animal {
    
    abstract void move();
}


class Bird extends Animal implements FlightEnabled, Trackable {

    @Override
    void move() {
       System.out.println("Flaps wings");
    }

    @Override
    public void takeOf() {
        System.out.println(getClass().getSimpleName()+ " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+ " is fly");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ " is track");
    }
    
}