package com.tasks.statickeyword.inventorysystem;

public class InventoryItem {

	static int totalItems;
	String itemName;
	int quantity;
	
	public InventoryItem(String itemName, int quantity) {
		
		this.itemName = itemName;
		this.quantity = quantity;
	
	}
	
	static int getTotalItems() {
	
		return totalItems;
		
	}
	
	void addToInventory(int num) {
		
		quantity += num;
		totalItems += quantity; 
//		while(num >= totalItems)
//				totalItems++;
		
	}
	
	void display() {
		System.out.println(itemName+" : "+quantity);
	}
	
	void removeFromInventory(int num) {
		
		quantity -= num;
		totalItems -= num; 
//		while(num >= totalItems)
//			totalItems--;
		
	}
	
	
	
}
