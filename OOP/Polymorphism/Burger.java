package OOP.Polymorphism;

public class Burger {
    

}

class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return this.name + " " + this.size;
        }
        return this.name;
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getAdjustedPrice() {
        return switch (this.size) {
            case "SMALL" -> this.getBasePrice() - 0.5;
            case "LARGE" -> this.getBasePrice() + 1;
            default -> this.getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20:%6.2F%n", name, price);
    }

    public void printItem() {
        printItem(this.getName(), this.getAdjustedPrice());
    }
}