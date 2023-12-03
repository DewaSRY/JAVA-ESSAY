package Designpattern.Behavioral.Mediator;

public class MediatorTwo {
    public static void main(String[] args) {
        System.out.println();
        Mediator mediator = new Mediator();
        Fan fan = new Fan();
        PowerSupplier ps = new PowerSupplier();
        Button button = new Button(mediator);

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(ps);

        button.press();
        button.press();
        button.press();
    }
}

class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }

    public Button() {
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator, boolean isOn) {
        this.mediator = mediator;
        this.isOn = isOn;
    }

    public Fan() {
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
        System.out.println("Fan On");
    }

    public void turnOff() {
        mediator.stop();
        isOn = false;
        System.out.println("Fan OFF");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

class Mediator {

    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public Mediator(Button button, Fan fan, PowerSupplier powerSupplier) {
        this.button = button;
        this.fan = fan;
        this.powerSupplier = powerSupplier;
    }

    public Mediator() {
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }

    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;

    }
}

class PowerSupplier {

    public void turnOn() {
        System.out.println("Power Supplier On");

    }

    public void turnOff() {
        System.out.println("Power Supplier Off");

    }
}
