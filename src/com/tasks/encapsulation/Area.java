package com.tasks.encapsulation;

public class Area {
	int length;
	int breadth;
	
	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		int Area = length * breadth;
		System.out.println("Area is :" + Area);
	}

	public static void main(String[] args) {
		
		Area a = new Area(5, 6);
		a.getArea();

	}

}
