package Designpattern.Behavioral.State;

import java.util.Scanner;

public class StateOne {
    public static void main(String[] args) {
        System.out.println();
        PullingFan fan1 = new PullingFan();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press Enter");
            String k = scanner.nextLine();

            if (k.isEmpty()) {
                fan1.push();
            }
        }

    }
}

interface FanState {
    void push(PullingFan wrapper);
}

class High implements FanState {
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setState(new Off());
        System.out.println("Turning Fan OFF");
    }
}

class Low implements FanState {
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setState(new Medium());
        System.out.println("Medium Speed");
    }
}

class Medium implements FanState {
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setState(new High());
        System.out.println("High Speed");
    }
}

class Off implements FanState {
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setState(new Low());
        System.out.println("Low Speed");
    }
}

class PullingFan {
    private FanState currentState;

    public PullingFan() {
        this.currentState = new Off();
    }

    public void setState(FanState currentState) {
        this.currentState = currentState;
    }

    public void push() {
        currentState.push(this);
    }
}