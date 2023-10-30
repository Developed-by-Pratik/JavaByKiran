package com.tasks.loops.series;

public class WhileLoopSeries {

	public static void main(String[] args) {

		// Series 1: Generate the Series... 2 4 6 8 10 12 14 16 18 20
		System.out.println("Series 1: Generate the Series... 2 4 6 8 10 12 14 16 18 20");
		int n1 = 2;
		while (n1 <= 20) {
			System.out.print(n1 + " ");
			n1 += 2;
		}
		System.out.println();

		// Series 2: Generate the Series... 9 18 27 36 45 54 63 72 81 90
		System.out.println("Series 2: Generate the Series... 9 18 27 36 45 54 63 72 81 90");
		int n2 = 9;
		while (n2 <= 90) {
			System.out.print(n2 + " ");
			n2 += 9;
		}
		System.out.println();

		// Series 3: Generate the Series... 1 -2 3-4 5-6 7-8 9-10
		System.out.println("Series 3: Generate the Series... 1 -2 3-4 5-6 7-8 9-10");
		int i3 = 1;
		while (i3 <= 10) {
			if (i3 % 2 != 0) {
				System.out.print(i3 + " ");
			} else {
				System.out.print(i3 + "-" + (i3 + 1) + " ");
				i3++;
			}
			i3++;
		}
		System.out.println();

		// Series 4: Generate the Series... 5 10 15 20 25 30 35 40 45 50
		System.out.println("Series 4: Generate the Series... 5 10 15 20 25 30 35 40 45 50");
		int n4 = 5;
		while (n4 <= 50) {
			System.out.print(n4 + " ");
			n4 += 5;
		}
		System.out.println();

		// Series 5: Generate the Series... 1 10 100 1000
		System.out.println("Series 5: Generate the Series... 1 10 100 1000");
		int value5 = 1;
		while (value5 <= 1000) {
			System.out.print(value5 + " ");
			value5 *= 10;
		}
		System.out.println();

		// Series 6: Generate the Series... 1 3 6 10 15 21 28 36 45
		System.out.println("Series 6: Generate the Series... 1 3 6 10 15 21 28 36 45");
		int i6 = 1;
		int increment = 2;
		while (i6 <= 45) {
			System.out.print(i6 + " ");
			i6 += increment;
			increment++;
		}
		System.out.println();

		// Series 7: Generate the Series... 8 16 24 32 40 48 56 64 72 80
		System.out.println("Series 7: Generate the Series... 8 16 24 32 40 48 56 64 72 80");
		int n7 = 8;
		while (n7 <= 80) {
			System.out.print(n7 + " ");
			n7 += 8;
		}
		System.out.println();

		// Series 8: Generate the Series... 0 1 1 2 3 5 8 13 21
		System.out.println("Series 8: Generate the Series... 0 1 1 2 3 5 8 13 21");
		int fib1 = 0, fib2 = 1;
		int fib3;
		int i8 = 0;
		while (i8 < 9) {
			System.out.print(fib1 + " ");
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			i8++;
		}
		System.out.println();

		// Series 9: Generate the Series... 1 4 9 16 25 36 49 64 81 100
		System.out.println("Series 9: Generate the series... 1 4 9 16 25 36 49 64 81 100");
		int n9 = 1;
		while (n9 <= 10) {
			System.out.print(n9 * n9 + " ");
			n9++;
		}
		System.out.println();

		// Series 10: Generate the series... 3 6 9 12 15 18 21 24 27 30
		System.out.println("Series 10: Generate the series... 3 6 9 12 15 18 21 24 27 30");
		int n10 = 3;
		while (n10 <= 30) {
			System.out.print(n10 + " ");
			n10 += 3;
		}
		System.out.println();

		// Series 11: Generate the Series... 7 14 21 28 35 42 49 56 63 70
		System.out.println("Series 11: Generate the Series... 7 14 21 28 35 42 49 56 63 70");
		int n11 = 7;
		while (n11 <= 70) {
			System.out.print(n11 + " ");
			n11 += 7;
		}
		System.out.println();

		// Series 12: Generate the Series... 4 8 12 16 20 24 28 32 36 40
		System.out.println("Series 12: Generate the Series... 4 8 12 16 20 24 28 32 36 40");
		int n12 = 4;
		while (n12 <= 40) {
			System.out.print(n12 + " ");
			n12 += 4;
		}
		System.out.println();

		// Series 13: Generate the Series... 10 20 30 40 50 60 70 80 90 100
		System.out.println("Series 13: Generate the Series... 10 20 30 40 50 60 70 80 90 100");
		int n13 = 10;
		while (n13 <= 100) {
			System.out.print(n13 + " ");
			n13 += 10;
		}
		System.out.println();

		// Series 14: Generate the Series... 1 2 3 4 5 4 3 2 1
		System.out.println("Series 14: Generate the Series... 1 2 3 4 5 4 3 2 1");
		int n14 = 1;
		while (n14 <= 5) {
			System.out.print(n14 + " ");
			n14++;
		}
		while (n14 >= 1) {
			System.out.print(n14 + " ");
			n14--;
		}
		System.out.println();

		// Series 15: Generate the Series... 6 12 18 24 30 36 42 48 54 60
		System.out.println("Series 15: Generate the Series... 6 12 18 24 30 36 42 48 54 60");
		int n15 = 6;
		while (n15 <= 60) {
			System.out.print(n15 + " ");
			n15 += 6;
		}
	}
}
