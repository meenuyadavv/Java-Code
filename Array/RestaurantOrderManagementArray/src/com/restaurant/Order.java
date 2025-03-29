package com.restaurant;

public class Order {
	
	public String food;
    public String drink;
    public String sweet;
    public int item;
    
    // Constructor for Order
    public Order(String food, String drink, String sweet, int item) {
        this.food = food;
        this.drink = drink;
        this.sweet = sweet;
        this.item = item;
    }

    // toString() method to display order details
    public String toString() {
        return "Food: " + food + ", Drink: " + drink + ", Sweet: " + sweet + ", Items: " + item;
    }

}
