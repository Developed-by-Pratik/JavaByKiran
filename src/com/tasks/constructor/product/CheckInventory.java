package com.tasks.constructor.product;

public class CheckInventory {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Product p = new Product();

		// Product 1 Details
		Product p1 = new Product(101, "Product1", 1000, 20);
		// Product 2 Details
        Product p2 = new Product(102, "Product2", 800, 13);
		
        System.out.println("ProductId " + "ProductName " + "Price   " + "QuantityStock");
        
        System.out.println("   " + p1.productId + "     " + p1.productName + "   " + p1.price + "      " + p1.quantityStock);
        System.out.println("   " + p2.productId + "     " + p2.productName + "   " + p2.price + "       " + p2.quantityStock);

	}

}
