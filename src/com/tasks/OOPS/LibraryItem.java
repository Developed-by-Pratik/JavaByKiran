package com.tasks.OOPS;

public class LibraryItem {

	@SuppressWarnings("unused")
	private String title;
	@SuppressWarnings("unused")
	private int itemID;

	public LibraryItem(String title, int itemID) {
		this.title = title;
		this.itemID = itemID;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public int getItemID() {
		return itemID;
	}
	
	public void displayInfo() {
		System.out.println("Title  : " + title);
		System.out.println("ID     : " + itemID);
	}
	
}










