package Designpattern.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyOne {
    public static void main(String[] args) {
        System.out.println();
    }
}

class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

}

class CreditCard implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card");
    }
}

class Item {

    private String itemCode;
    private int price;

    public Item(String itemCode, int price) {
        this.itemCode = itemCode;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getPrice() {
        return price;
    }
}

interface PaymentStrategy {
    void pay(int amount);
}

class Paypal implements PaymentStrategy {

    private String emailID;
    private String password;

    public Paypal(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }
}
