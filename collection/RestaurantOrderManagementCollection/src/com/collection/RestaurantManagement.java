package com.collection;

import java.util.ArrayList;

public class RestaurantManagement {
	
	ArrayList<Order> orders = new ArrayList<>();
	
	public void addOrder(Order order) {
		
		orders.add(order);
	}
	
	// Orders display karne ka method
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet!");
        } else {
            System.out.println("All Orders:");
            for (Order order : orders) {
                System.out.println(order); // toString() automatically call hoga
            }
        }
    }

}
