package com.tasks.constructor.person;

public class DisplayPersonInfo {

	public static void main(String[] args) {

		Person p1 = new Person("Pratik", 21);

		Person p2 = new Person("Raju", 25);

		Person p3 = new Person("Sham", 18);

		System.out.println("Person 1: Name - " + p1.name + ", Age - " + p1.age);

		System.out.println("Person 2: Name - " + p2.name + ", Age - " + p2.age);

		System.out.println("Person 3: Name - " + p3.name + ", Age - " + p3.age);

	}

}
