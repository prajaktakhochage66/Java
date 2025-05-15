package Exp5;

public class Customer {
    private final String name;
    private final int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void displayCustomer() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer Name : " + name);
        System.out.println("Customer ID   : " + customerId);
    }
}
