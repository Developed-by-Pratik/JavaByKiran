package com.tasks.polymorphism.library;

public class DVD extends LibraryItem {

	String director;
	float runtime;

	public DVD(String title, String author, String location, String director, float runtime) {
		super(title, author, location);
		this.director = director;
		this.runtime = runtime;
	}

	@Override
	void displayInfo() {
		System.out.println("Director    : " + director);
		System.out.println("Run Time    : " + runtime + " mins");
	}
}
