package com.tasks.constructor.library;

public class Library {

	public static void main(String[] args) {

		
		@SuppressWarnings("unused")
		LibraryBook b = new LibraryBook(); // to initialize

		LibraryBook b1 = new LibraryBook("Book1", "author1", "1234");
		LibraryBook b2 = new LibraryBook("Book2", "author2", "5678");
		LibraryBook b3 = new LibraryBook("Book3", "author3", "7692");
		
		b1.borrowBook();
		b2.borrowBook();
		b3.borrowBook();
		
		b1.returnBook();
		b3.returnBook();
		
		System.out.println("Book 1 Available : " + b1.available);
		System.out.println("Book 2 Available : " + b2.available);
		System.out.println("Book 3 Available : " + b3.available);

	}

}
