package Designpattern.Behavioral.ChainOfResponsibility;

public class Calculator {
    public static void main(String[] args) {
        System.out.println();
    }
}

interface Chain {

    void setNextChain(Chain nextChain);

    void calculate(Numbers request);

}

class AddNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
        System.out.println("Passing to next Chain");
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperationName() == "add") {
            System.out.println(request.getNum1() + " + " + request.getNum2()
                    + " = " + (request.getNum1() + request.getNum2()));
        } else {

            nextInChain.calculate(request);
        }

    }
}

class DivideNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
        System.out.println("Passing to next Chain");
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperationName() == "div") {
            System.out.println(request.getNum1() + " / " + request.getNum2()
                    + " = " + (request.getNum1() / request.getNum2()));
        } else {

            System.out.println("No Next Operation!");
        }
    }
}

class MultiplyNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
        System.out.println("Passing to next Chain");
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperationName() == "mul") {
            System.out.println(request.getNum1() + " x " + request.getNum2()
                    + " = " + (request.getNum1() * request.getNum2()));
        } else {

            nextInChain.calculate(request);
        }
    }
}

class Numbers {

    private int num1;
    private int num2;

    private String operationName;

    public Numbers(int num1, int num2, String operationName) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationName = operationName;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperationName() {
        return operationName;
    }
}

class SubtractNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
        System.out.println("Passing to next Chain");
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperationName() == "sub") {
            System.out.println(request.getNum1() + " - " + request.getNum2()
                    + " = " + (request.getNum1() - request.getNum2()));
        } else {

            nextInChain.calculate(request);
        }
    }
}
