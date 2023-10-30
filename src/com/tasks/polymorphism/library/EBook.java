package com.tasks.polymorphism.library;

public class EBook extends LibraryItem {

	String format;
	int fileSize;

	public EBook(String title, String author, String location, String format, int fileSize) {
		super(title, author, location);
		this.format = format;
		this.fileSize = fileSize;
	}

	@Override
	void displayInfo() {
		System.out.println("Format      : " + format);
		System.out.println("File Size   : " + fileSize + " MB");
	}

}
