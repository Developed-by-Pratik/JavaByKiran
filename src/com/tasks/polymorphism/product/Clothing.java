package com.tasks.polymorphism.product;

public class Clothing extends Product {

	int size;
	String color;
	String material;
	
	public Clothing(String name, String description, double price, int size, String color, String material) {
		super(name, description, price);
		this.size = size;
		this.color = color;
		this.material = material;
	}
	
	@Override
	void calculateDiscount() {	
		int discountPercentage = 40;
		double discount = super.price * 0.4;
		System.out.println("\n\nCalculating Discount.....!!");
		System.out.println("Your Actual Amount is : " + super.price);
		System.out.println("       After discount : " + (super.price-discount));
		System.out.println("       Got " + discountPercentage + " discount !");
	}
	
}
