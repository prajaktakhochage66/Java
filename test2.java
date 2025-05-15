package Exp5_Test;

import Exp5.Customer;
import Exp5.Order;
import Exp5.Product;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Product Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Customer Name: ");
            String cname = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            Product p = new Product(pname, cname, price);
            Customer c = new Customer(cname, qty);
            Order o = new Order(p, c, qty);
            o.placeOrder();
        }
    }

}

/*
 * output:
 * Enter Product Name: book
 * Enter Product Price: 500
 * Enter Customer Name: raj
 * Enter Quantity: 2
 * --- Order Placed ---
 * Customer Name: raj
 * Product Name: book
 * Price: 500.0
 * Quantity: 2
 * Total Cost: 1000.0
 * 
 */