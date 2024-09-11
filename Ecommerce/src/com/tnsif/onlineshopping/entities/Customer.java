package com.tnsif.onlineshopping.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String address;
    private ShoppingCart shoppingCart;
    private List<Order> orders;

    // Constructor to initialize the Customer object with userId, username, email, and address
    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
        this.shoppingCart = new ShoppingCart();
        this.orders = new ArrayList<>();
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for shoppingCart
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    // Getter for orders
    public List<Order> getOrders() {
        return orders;
    }

    // Method to add a new order to the customer's list of orders
    public void addOrder(Order order) {
        orders.add(order);
    }
}