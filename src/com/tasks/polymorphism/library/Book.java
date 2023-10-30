package com.tasks.polymorphism.library;

public class Book extends LibraryItem {

	private String genre;
	private int noOfPages;

	public Book(String title, String author, String location, String genre, int noOfPages) {
		super(title, author, location);
		this.genre = genre;
		this.noOfPages = noOfPages;
	}

	@Override
	void displayInfo() {
		System.out.println("Genre       : " + genre);
		System.out.println("No of Pages : " + noOfPages);
	}

}
