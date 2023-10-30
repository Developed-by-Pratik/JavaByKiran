package com.tasks.polymorphism.library;

public class LibraryItem {

	private String title;
	private String author;
	private String location;

	public LibraryItem(String title, String author, String location) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setLocation(location);
	}

	void displayInfo() {

		System.out.println();
		System.out.println("Title       : " + getTitle());
		System.out.println("Author      : " + getAuthor());
		System.out.println("Location    : " + getLocation());

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
