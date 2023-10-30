package com.tasks.statickeyword.arithmatic;

public class MathOperations {

	static int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {

		int sum = MathOperations.add(5, 7);
		int sum1 = MathOperations.add(10, 20);
		System.out.println("sum is : " + sum);
		System.out.println("sum is : " + sum1);

	}

}
