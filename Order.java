package Exp5;

public class Order {
    private final Product product;
    private final Customer customer;
    private final int quantity;

    public Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return product.getPrice() * quantity;
    }

    public void placeOrder() {
        System.out.println("\nPlacing order...");
        customer.displayCustomer();
        product.displayProduct();
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Cost    : $" + calculateTotal());
    }
}
