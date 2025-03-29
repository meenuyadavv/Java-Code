package com.collection;

public class Order {
	
	public String food;
	public String drink;
	public String sweet;
	public int item;
	
	public String orderPlace(String food,String drink,String sweet,int item) {
		this.food=food;
		this.drink=drink;
		this.sweet=sweet;
		this.item=item;
		
		return "order placed succesfully";
		
	}

	@Override
	public String toString() {
		return "Order [food=" + food + ", drink=" + drink + ", sweet=" + sweet + ", item=" + item + "]";
	}
	
	

}
