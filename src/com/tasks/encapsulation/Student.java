package com.tasks.encapsulation;

public class Student {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();
		s1.name = "pratik kakade";
		System.out.println(s1.name);
		
		s.setName("Pratik");
		System.out.println(s.getName());

	}
}
