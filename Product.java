package Exp5;

public class Product {
    private final String name;
    private final String productId;
    private final double price;

    public Product(String name, String productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Name : " + name);
        System.out.println("Product ID   : " + productId);
        System.out.println("Price        : $" + price);
    }
}
