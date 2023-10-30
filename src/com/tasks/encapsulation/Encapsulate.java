package com.tasks.encapsulation;

public class Encapsulate {

	private String name;
	private int Roll;
	private int Age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public static void main(String[] args) {

		Encapsulate obj = new Encapsulate();

		obj.setName("Pratik");
		obj.setAge(20);

		// due to encapsulation
		// direct access of roll is not possible
		// obj.Roll(1134);
		obj.setRoll(1134);

		System.out.println("Name : " + obj.getName());
		System.out.println("Age : " + obj.getAge());
		System.out.println("Roll : " + obj.getRoll());

	}
}
