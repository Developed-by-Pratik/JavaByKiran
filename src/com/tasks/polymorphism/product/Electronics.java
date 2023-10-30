package com.tasks.polymorphism.product;

public class Electronics extends Product {
	
	int warrantyPeriod;
	String brand;
	
	public Electronics(String name, String description, double price, int warrantyPeriod, String brand) {
		super(name, description, price);
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
	}
	
	@Override
	void calculateDiscount() {
		int discountPercentage = 20;
		double discount = super.price * 0.2;
		System.out.println("\n\nCalculating Discount.....!!");
		System.out.println("Your Actual Amount is : " + super.price);
		System.out.println("       After discount : " + (super.price-discount));
		System.out.println("       Got " + discountPercentage + " discount !");
	}
	
	
	
}
