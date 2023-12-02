package Designpattern.Structural.Decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new Veggie(); // Initial Pizza
        System.out.println(pizza.getDescription() +
                " Cost: " + pizza.getCost());

        // Decorate it with Cheese
        System.out.println("After Decoration: ");

        pizza = new Cheese(pizza.getDescription(), pizza);
        // Decorate it with Tomato
        pizza = new Tomato(pizza.getDescription(), pizza);
        System.out.println(pizza.getDescription() +
                " Cost: " + pizza.getCost());

    }
}

class Barbeque extends ToppingsDecorator {
    Pizza pizza;

    public Barbeque(String description, Pizza pizza) {
        super(description);
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 10 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ,Barbeque Topping";

    }
}

class Cheese extends ToppingsDecorator {

    // Initial Pizza
    Pizza pizza;

    public Cheese(String description, Pizza pizza) {
        super("Cheese Toppings");
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ,Cheese Topping";
    }
}

class Margherita extends Pizza {

    public Margherita() {
        super("Margherita");
    }

    @Override
    public int getCost() {
        return 20;
    }
}

class Pepperoni extends Pizza {
    public Pepperoni() {
        super("Pepperoni");
    }

    @Override
    public int getCost() {
        return 30;
    }
}

abstract class Pizza {
    String description = "Basic Pizza";

    public Pizza(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}

class Tomato extends ToppingsDecorator {
    Pizza pizza;

    public Tomato(String description, Pizza pizza) {
        super(description);
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ,Tomato Topping";
    }
}

abstract class ToppingsDecorator extends Pizza {

    public abstract String getDescription();

    public ToppingsDecorator(String description) {
        super(description);
    }
}

class Veggie extends Pizza {
    public Veggie() {
        super("Veggie");
    }

    @Override
    public int getCost() {
        return 10;
    }
}
