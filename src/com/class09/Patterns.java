package com.class09;

public class Patterns {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			System.out.print("*");
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {

			System.out.print("*");
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {

			System.out.print("*");
		}

		System.out.println();
		System.out.println("-------------------------");

		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 1; a < 6; a++) {
			for (int b = 6; b >= 1; b--) {
				System.out.print(b + " ");

			}
			System.out.println();
		}
		System.out.println("--------------------");

		for (int a = 1; a < 6; a++) {
			for (int b = 6; b >= 1; b--) {
				System.out.print(a + " ");

			}
			System.out.println();
		}
		System.out.println("--------------------");

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");

	}

}
