package com.tasks.polymorphism.library;

import java.util.Scanner;

public class LibraryManagment {

	public static void main(String[] args) {
		
		
		
		LibraryItem l1  = new LibraryItem("The Great Gatsby      ", "F. Scott Fitzgerald", "1st Floor");
		LibraryItem l2  = new LibraryItem("To Kill a Mockingbird ", "Harper Lee         ", "2nd Floor");
		LibraryItem l3  = new LibraryItem("1984                  ", "George Orwell      ", "3rd Floor");
		LibraryItem l4  = new LibraryItem("Pride and Prejudice   ", "Jane Austen        ", "1st Floor");
		LibraryItem l5  = new LibraryItem("The Catcher in the Rye", "J.D. Salinger      ", "4th Floor");
		LibraryItem l6  = new LibraryItem("The Lord of the Rings ", "J.R.R. Tolkien     ", "2nd Floor");
		LibraryItem l7  = new LibraryItem("Harry Potter and Stone", "J.K. Rowling       ", "3rd Floor");
		LibraryItem l8  = new LibraryItem("The Hobbit             ", "J.R.R. Tolkien     ", "1st Floor");
		LibraryItem l9  = new LibraryItem("Moby-Dick             ", "Herman Melville    ", "2nd Floor");
		LibraryItem l10 = new LibraryItem("The Odyssey           ", "Homer              ", "4th Floor");
		LibraryItem l11 = new LibraryItem("War and Peace         ", "Leo Tolstoy        ", "1st Floor");
		LibraryItem l12 = new LibraryItem("Dracula               ", "Bram Stoker        ", "3rd Floor");
		LibraryItem l13 = new LibraryItem("The Grapes of Wrath   ", "John Steinbeck     ", "2nd Floor");
		LibraryItem l14 = new LibraryItem("The Hunger Games      ", "Suzanne Collins    ", "4th Floor");
		LibraryItem l15 = new LibraryItem("To the Lighthouse     ", "Virginia Woolf     ", "1st Floor");

		
		
		
		System.out.println("\n            ! Library Management System !       \n ");
		System.out.println("-----------------------------------------------------------------");
		
		
		System.out.println("No Title\t\t\tAuthor\t\t\tLocation");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("List Of Books...!!");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("01 " + l1.getTitle() + "\t" + l1.getAuthor() + "\t" + l1.getLocation());
		System.out.println("02 " + l2.getTitle() + "\t" + l2.getAuthor() + "\t" + l2.getLocation());
		System.out.println("03 " + l3.getTitle() + "\t" + l3.getAuthor() + "\t" + l3.getLocation());
		System.out.println("04 " + l4.getTitle() + "\t" + l4.getAuthor() + "\t" + l4.getLocation());
		System.out.println("05 " + l5.getTitle() + "\t" + l5.getAuthor() + "\t" + l5.getLocation());

		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("List Of EBooks...!!");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("06 " + l6.getTitle() + "\t" + l6.getAuthor() + "\t" + l6.getLocation());
		System.out.println("07 " + l7.getTitle() + "\t" + l7.getAuthor() + "\t" + l7.getLocation());
		System.out.println("08 " + l8.getTitle() + "\t" + l8.getAuthor() + "\t" + l8.getLocation());
		System.out.println("09 " + l9.getTitle() + "\t" + l9.getAuthor() + "\t" + l9.getLocation());
		System.out.println("10 " + l10.getTitle() + "\t" + l10.getAuthor() + "\t" + l10.getLocation());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("List Of DVD's...!!");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("11 " + l11.getTitle() + "\t" + l11.getAuthor() + "\t" + l11.getLocation());
		System.out.println("12 " + l12.getTitle() + "\t" + l12.getAuthor() + "\t" + l12.getLocation());
		System.out.println("13 " + l13.getTitle() + "\t" + l13.getAuthor() + "\t" + l13.getLocation());
		System.out.println("14 " + l14.getTitle() + "\t" + l14.getAuthor() + "\t" + l14.getLocation());
		System.out.println("15 " + l15.getTitle() + "\t" + l15.getAuthor() + "\t" + l15.getLocation());
		
		System.out.print("\nEnter The No For More Details : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		switch (no) {
		case 1:
			l1.displayInfo();
			Book b1 = new Book(null, null, null, "History", 450);
			b1.displayInfo();
			break;
		case 2:
			l2.displayInfo();
			Book b2 = new Book(null, null, null, "Horror", 300);
			b2.displayInfo();
			break;
		case 3:
			l3.displayInfo();
			Book b3 = new Book(null, null, null, "Mistort", 390);
			b3.displayInfo();
			break;
		case 4:
			l4.displayInfo();
			Book b4 = new Book(null, null, null, "Crime", 980);
			b4.displayInfo();
			break;
		case 5:
			l5.displayInfo();
			Book b5 = new Book(null, null, null, "Novel", 730);
			b5.displayInfo();
			break;
		case 6:
		    l6.displayInfo();
		    EBook e6 = new EBook(null, null, null, "PDF", 16);
		    e6.displayInfo();
		    break;
		case 7:
		    l7.displayInfo();
		    EBook e7 = new EBook(null, null, null, "ePub", 20);
		    e7.displayInfo();
		    break;
		case 8:
		    l8.displayInfo();
		    EBook e8 = new EBook(null, null, null, "MOBI", 25);
		    e8.displayInfo();
		    break;
		case 9:
		    l9.displayInfo();
		    EBook e9 = new EBook(null, null, null, "AZW", 12);
		    e9.displayInfo();
		    break;
		case 10:
		    l10.displayInfo();
		    EBook e10 = new EBook(null, null, null, "EPUB", 18);
		    e10.displayInfo();
		    break;
		case 11:
		    l11.displayInfo();
		    DVD d11 = new DVD(null, null, null, "AVL Productions", 12.6f);
		    d11.displayInfo();
		    break;
		case 12:
		    l12.displayInfo();
		    DVD d12 = new DVD(null, null, null, "XYZ Films", 9.8f);
		    d12.displayInfo();
		    break;
		case 13:
		    l13.displayInfo();
		    DVD d13 = new DVD(null, null, null, "FilmCo", 15.2f);
		    d13.displayInfo();
		    break;
		case 14:
		    l14.displayInfo();
		    DVD d14 = new DVD(null, null, null, "Cinema Magic", 7.5f);
		    d14.displayInfo();
		    break;
		case 15:
		    l15.displayInfo();
		    DVD d15 = new DVD(null, null, null, "Movie Masters", 10.3f);
		    d15.displayInfo();
		    break;

		default:
			System.out.println("This Book is Not Available !");
			break;
		}
		
		sc.close();
	}

}
