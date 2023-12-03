package Designpattern.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class MementoOne {
    public static void main(String[] args) {
        System.out.println();
    }
}

class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Saving memento
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // Restoring memento
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

}
