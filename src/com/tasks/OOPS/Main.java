package com.tasks.OOPS;

public class Main extends LibraryItem{

	public Main(String title, int itemID) {
		super(title, itemID);
	}

	public static void main(String[] args) {
		
		Book b1 = new Book("Book1", 101, "Pratik");
		b1.displayInfo();
		System.out.println();
		
		DVDs d1 = new DVDs("Dvd1", 104, 12.4f);
		d1.displayInfo();
		System.out.println();
		
		System.out.println("______________________________\n\n");
		
		StudentMember s = new StudentMember(101, "Rajesh");
		s.borrowItem(b1);
		
		System.out.println();
		
		FacultyMember f = new FacultyMember(102, "Manish");
		f.borrowItem(d1);
	}
}
