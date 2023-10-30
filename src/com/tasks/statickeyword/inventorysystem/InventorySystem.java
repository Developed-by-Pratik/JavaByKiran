package com.tasks.statickeyword.inventorysystem;

public class InventorySystem {

	public static void main(String[] args) {

		InventoryItem item1 = new InventoryItem("TV", 5);
		InventoryItem item2 = new InventoryItem("AC", 7);
		InventoryItem item3 = new InventoryItem("Fridge", 3);
		InventoryItem item4 = new InventoryItem("Fan", 9);
		InventoryItem item5 = new InventoryItem("Bulb", 1);

		item1.display();
		item1.addToInventory(3);
		item1.display();
		item1.removeFromInventory(2);
		item1.display();
		InventoryItem.getTotalItems();
		System.out.println();

		item2.display();
		item2.addToInventory(5);
		item2.display();
		item2.removeFromInventory(4);
		item2.display();
		System.out.println();

		item3.display();
		item3.addToInventory(10);
		item3.display();
		item3.removeFromInventory(7);
		item3.display();
		System.out.println();

		item4.display();
		item4.addToInventory(8);
		item4.display();
		item4.removeFromInventory(3);
		item4.display();
		System.out.println();

		item5.display();
		item5.addToInventory(4);
		item5.display();
		item5.removeFromInventory(1);
		item5.display();
		System.out.println();
		
		System.out.println("Total items is : " + InventoryItem.totalItems);
		
	}

}
