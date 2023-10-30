package com.tasks.constructor.product;

public class Product {
	int productId;
	String productName;
	double price;
	int quantityStock;

	Product() // Default Constructor
	{

		productId = 0;
		productName = "";
		price = 0.0;
		quantityStock = 0;

	}

	Product(int productId, String productName, double price, int quantityStock) // Parameterised Constructor
	{

		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityStock = quantityStock;

	}

}
