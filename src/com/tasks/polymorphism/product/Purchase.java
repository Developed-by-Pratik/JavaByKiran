package com.tasks.polymorphism.product;

public class Purchase extends Product {

	public Purchase(String name, String description, double price) {
		super(name, description, price);
	}

	public static void main(String[] args) {
		
		Product p = new Product("P1", "Product1", 120);
		p.calculateDiscount();
		
		Electronics e = new Electronics("Mobile", "Iphone",58000, 12,"Sony");
		e.calculateDiscount();
		
		Clothing c = new Clothing("Shirt", "Levis", 4000, 46, "Red", "Lycra");
		c.calculateDiscount();
		
	}
	
}
