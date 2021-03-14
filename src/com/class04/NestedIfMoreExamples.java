package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {

		/*
		 * if is friday ----> go to the movie, otherwise stay at home and study if it
		 * is friday then i will check if day is 13 ----> if yes--->watch scary movie if
		 * no===--->watch any movie you like
		 */

		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("It is a movie day!!!");
			if (day == 13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I watch any available movie");
			}

		} else {
			System.out.println("I will stay at home and study");
		}

	}

}
