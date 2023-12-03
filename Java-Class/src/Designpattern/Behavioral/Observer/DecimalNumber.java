package Designpattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class DecimalNumber {
    public static void main(String[] args) {
        System.out.println();
        Subject s = new Subject();

        // Creating Observers
        new HexaObserver(s);
        new OctalObserver(s);
        new BinaryObserver(s);

        // Before Change
        System.out.println("Initial State: 20");
        s.setState(20);

        // Changing the Number from 20 --> 30
        s.setState(30);
    }
}

abstract class Observery {
    Subject subject;

    public abstract void update();
}

class BinaryObserver extends Observery {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " +
                Integer.toBinaryString(subject.getState()));
    }
}

class HexaObserver extends Observery {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " +
                Integer.toHexString(subject.getState()));

    }
}

class OctalObserver extends Observery {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " +
                Integer.toOctalString(subject.getState()));

    }
}

class Subject {
    private List<Observery> observers = new ArrayList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void subscribeToList(Observery observery) {
        observers.add(observery);
    }

    private void notifyAllObservers() {
        for (Observery o : observers) {
            o.update();
        }
    }
}