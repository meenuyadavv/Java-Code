package com.collection;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      RestaurantManagement r = new RestaurantManagement(); // RestaurantManagement ka ek hi object banega
      
     while(true) { 
 	 System.out.println("menu list");
     System.out.println("1. Place Order");
     System.out.println("2. Show All Orders");
     System.out.println("3. Exit");
     System.out.print("Enter your choice: ");
 
     int choice = sc.nextInt();
     
     switch (choice) {
         case 1:
             System.out.print("Enter food: ");
             String food = sc.next();
             
             System.out.print("Enter drink: ");
             String drink = sc.next();
             
             System.out.print("Enter sweet: ");
             String sweet = sc.next();
             
             System.out.print("Enter item count: ");
             int item = sc.nextInt();
             
             Order order = new Order();
             order.orderPlace(food, drink, sweet, item);
             
             r.addOrder(order);
             
             break;

         case 2:
        	 
        	 r.displayOrders();
             
             break;
             
         case 3:
             System.out.println("Exiting...");
             sc.close();
             return;

         default:
             System.out.println("Invalid choice! Please enter again.");
     }
       
	
	}

}

}
