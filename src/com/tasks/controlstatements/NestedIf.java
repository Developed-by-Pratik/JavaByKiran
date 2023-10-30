package com.tasks.controlstatements;

public class NestedIf {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
		
		if (x == 10) {
			if (y == 11) {
				System.out.println("Both are Equal!");
			}else {
				System.out.println("Not equal");
			}
		}

	}

}
