package com.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {

			for (int j = 1; j < 5; j++) {
				System.out.println("Good evening");
			}
			System.out.println("-------------");
		}

		for (int i = 1; i < 3; i++) {
			System.out.println("Outer Loop");

			for (int j = 1; j <= 4; j++) {
				System.out.println("Inner Loop");
			}
		}

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j <= 9; j++) {
				System.out.println(i + " " + j);
			}
		}
		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j < 10; j++) {
				for (int a = 0; a < 10; a++) {
					for (int b = 0; b < 10; b++) {
						System.out.println(i + " " + j + " " + a + " " + b);
					}
				}
			}
		}

		System.out.println("---------------------Clock----------------------");

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++)

				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (h < 10 && m >= 10) {
					System.out.println("0" + h + ":" + m);
				} else if (h >= 10 && m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}

		}

		System.out.println("------------Clock-------------");

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {

				if (h < 10) {

					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {

					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);

					}
				}

				int result;

				for (int a = 1; a <= 9; a++) {

					for (int b = 1; b <= 9; b++) {

						result = a * b;
						System.out.println(a + " x " + b + " = " + result);
					}
				}

			}
		}

	}

}
