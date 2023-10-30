package List;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {

    public Customer(String name, double initDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        this.transaction.add(initDeposit);
    }
}

public class AutoBoxingCL {

    public static void run() {
        // Customer bob = new Customer("bob", 13);

    }
}

class Bank {
    
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {
        for (var cs : this.customers) {
            if (cs.name().equalsIgnoreCase(customerName)) {
                return cs;
            }
        }
        System.out.printf(" Customer (%s) wasm't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initDeposit) {
        if (this.getCustomer(customerName) == null) {
            Customer cs = new Customer(customerName, initDeposit);
            this.customers.add(cs);
            System.out.printf("New Customer add : %s", customerName);
        }
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name=  '" + this.name + "'" +
                "customers= '" + this.customers + "," +
                "}";
    }
    
    public void addTransaction(String name, double transactionAmount) {
        Customer cs = this.getCustomer(name);
        if (cs != null) {
            cs.transaction().add(transactionAmount);
        }

    }

    public void printStatement(String customerName) {
        Customer cs = this.getCustomer(name);
        if (cs == null)
            return;
        else {
            System.out.println("_".repeat(30));
            System.out.println("Customer name: " + cs.name());
            System.out.println("Transaction :");
            for (double d : cs.transaction()) {
                System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
            }
            
        }
    }
}
