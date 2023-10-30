package com.tasks.OOPS;

public class Book extends LibraryItem {

	@SuppressWarnings("unused")
	private String author;

	public Book(String title, int itemID, String author) {
		super(title, itemID);
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Author : " + author);
	}

}
