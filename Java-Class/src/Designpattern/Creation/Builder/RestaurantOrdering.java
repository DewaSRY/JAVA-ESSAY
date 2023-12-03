package Designpattern.Creation.Builder;

public class RestaurantOrdering {
    public static void main(String[] args) {
        // Creating the sandwich:
        HamBurger hamBurger = new HamBurger();
        hamBurger.createSandwich();
    }
}

class Barbeque extends Sauce {
    public Barbeque() {
        super("Barbeque");
    }

    @Override
    public String toString() {
        return "Barbeque";
    }
}

class Beef extends Meat {
    public Beef() {
        super("Beef");
    }
}

class ByDelivery extends Delivery {
    @Override
    public void deliver() {
        System.out.println("BY Delivery");
    }
}

abstract class Delivery {
    public abstract void deliver();
}

class Fish extends Meat {
    public Fish() {
        super("Fish");
    }
}

class HamBurger extends SandwichBuilder {
    @Override
    public void buildMeat() {
        sandwich.setMeat(new Beef());
    }

    @Override
    public void buildSauce() {
        sandwich.setSauce(new Barbeque());
    }

    @Override
    public void buildDelivery() {
        sandwich.setDelivery(new OnTable());
    }

}

abstract class Ingredient {
    String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Mayounese extends Sauce {
    public Mayounese() {
        super("Mayonnaise");
    }
}

abstract class Meat extends Ingredient {
    public Meat(String name) {
        super(name);
    }
}

class OnTable extends Delivery {
    @Override
    public void deliver() {
        System.out.println("OnTable");
    }
}

class Sandwich {

    Meat meat;
    Sauce sauce;
    Delivery delivery;

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Meat getMeat() {
        return meat;
    }

    public Sauce getSauce() {
        return sauce;
    }
}

abstract class SandwichBuilder {
    Sandwich sandwich;

    public void createSandwich() {
        sandwich = new Sandwich();
        buildMeat();
        buildSauce();
        buildDelivery();
        System.out.println("Sandwich Created! " +
                sandwich.getSauce() + " + "
                + sandwich.getMeat() +
                " + " + sandwich.getDelivery());
    }

    public abstract void buildMeat();

    public abstract void buildSauce();

    public abstract void buildDelivery();

}

abstract class Sauce extends Ingredient {
    public Sauce(String name) {
        super(name);
    }
}

class SweetSour extends Sauce {
    public SweetSour() {
        super("SweetSour");
    }
}

class TakeAway extends Delivery {
    @Override
    public void deliver() {
        System.out.println("TakeAway");
    }
}
