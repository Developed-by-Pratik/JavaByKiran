package com.tasks.constructor.library;

public class LibraryBook {
	
	String title;
	String author;
	String isbn;
	boolean available;
	
	//Missing Part in solution 
	LibraryBook() //Default Constructor to intialize
 	{
		available = true;
	}
	
	LibraryBook(String title, String author, String isbn)//Parameterised Constructor
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	void borrowBook() {
		
		available = false;
		System.out.println("Book is borrowed\n");
		
	}
	
	void returnBook() {
		
		available = true;
		System.out.println("Book is returned\n");
		
	}
	
	
}
