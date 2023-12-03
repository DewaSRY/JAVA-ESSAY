package Designpattern.Behavioral.State;

public class StateTwo {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();

        stateContext.setCurrentState(new Silent());
        stateContext.alert();
    }
}

class AlertStateContext {

    private MobileState currentState;

    public AlertStateContext() {
        this.currentState = new Vibration();
    }

    public void setCurrentState(MobileState currentState) {
        this.currentState = currentState;
    }

    public void alert() {
        currentState.alert(this);
    }

}

interface MobileState {
    void alert(AlertStateContext ctx);
}

class Silent implements MobileState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Silent Mode");
    }
}

class Vibration implements MobileState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Vibration Mode");
    }
}
