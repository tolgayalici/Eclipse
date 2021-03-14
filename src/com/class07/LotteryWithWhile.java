package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {

		Scanner scan;
		int num;
		int lotteryNumber = 17;

		scan = new Scanner(System.in);

		System.out.println("Please enter any number from 1-100 to win the lottery");
		num = scan.nextInt();

		while (num != lotteryNumber) {
			System.out.println("Please enter any number from 1-100 to win the lottery");
			num = scan.nextInt();
		}

		System.out.println("Congratulations you entered " + num + " which is a lucky number");

	}

}
