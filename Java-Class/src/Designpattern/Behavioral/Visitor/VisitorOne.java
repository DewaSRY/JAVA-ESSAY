package Designpattern.Behavioral.Visitor;

public class VisitorOne {
    public static void main(String[] args) {
        System.out.println();
    }
}

class ByDelivery implements HowTo {
    private String name;
    private final String method = "BY Delivery";

    @Override
    public void visit(Pizza pizza) {
        pizza.order();
    }

    @Override
    public String toString() {
        return "ByDelivery{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}

class Veggie implements Pizza {
    @Override
    public String order() {
        return "Veggie Pizza ";
    }
}

class TakeAway implements HowTo {
    private String name;
    private final String method = "Take Away";

    @Override
    public void visit(Pizza pizza) {
        pizza.order();
    }

    @Override
    public String toString() {
        return "TakeAway{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}

interface Pizza {
    String order();

}

class OnTable implements HowTo {
    private String name;
    private final String method = "On Table";

    @Override
    public void visit(Pizza pizza) {
        pizza.order();
    }

    @Override
    public String toString() {
        return "OnTable{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}

class Meat implements Pizza {
    @Override
    public String order() {
        return "Meat Pizza ";
    }
}

interface HowTo {
    void visit(Pizza pizza);
}

interface Dinner {
    Pizza getDinner();

    HowTo howToDeliver();
}

class Cheeze implements Pizza {
    @Override
    public String order() {
        return "Cheese Pizza ";
    }
}
