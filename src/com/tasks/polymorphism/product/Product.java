package com.tasks.polymorphism.product;

public class Product {

	String name;
	String description;
	double price;

	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	void calculateDiscount() {
		int discountPercentage = 0;
		double discount = price * 0;
		System.out.println("\n\nCalculating Discount.....!!");
		System.out.println("Your Actual Amount is : " + price);
		System.out.println("       After discount : " + (price-discount));
		System.out.println("       Got " + discountPercentage + " discount !");
	}
}
