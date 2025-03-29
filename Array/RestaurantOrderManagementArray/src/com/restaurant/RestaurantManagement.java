package com.restaurant;

public class RestaurantManagement {
	
	//Flexibility: User se size input lene ki flexibility rahegi
	//Memory Efficient: Jab object create hoga tabhi array allocate hoga
	//Reusability: Alag-alag size ke array bana sakte hain
	
    Order[] orders;  // Multiple orders store karne ke liye array
    int orderCount;  // Kitne orders store ho chuke hain

    
    // Constructor to initialize array
    public RestaurantManagement(int size) {
    	orders = new Order[size]; // Array ka size fix kar diya
        orderCount = 0;           // Shuru me koi order nahi hai
    }
    
 // Order add karne ka method
    public void addOrder(Order order) {//new order(); ess trah kaa kaam kr raha hai 
        if (orderCount < orders.length) {
            orders[orderCount] = order; // Naya order array me store kar diya
            orderCount++;
            System.out.println("Order added successfully!");
        } else {
            System.out.println("No space to add more orders!");
        }
    }
    
    
    // Saare orders dikhane ka method
    public void displayOrders() {
        if (orderCount == 0) {
            System.out.println("No orders placed yet!");
        } else {
            System.out.println("All Orders:");
            for (int i = 0; i < orderCount; i++) {
                System.out.println(orders[i]); // toString() method call hoga
            }
        }
    }
    
}
//class RestaurantManagement {
  //  private Order[] orders = new Order[5];  // Direct yaha initialize kiya
    //private int orderCount = 0;  
//}


//Humne orders array ko direct initialize kar diya
//orderCount ko bhi initialize kar diya

// Fixed Size – Har baar 5 ka hi array milega, chahe user 10 chahe ya 2
//❌ Memory Wastage – Agar user sirf 2 orders chahta hai, toh bhi 5 ka array banega
//❌ Reuse Issue – Agar dusri jagah alag size ka array chahiye toh alag constructor likhna padega
//User se size ka input le sakte hain
//Jitni zaroorat ho utni memory use hogi
//Future me flexibility rahegi
