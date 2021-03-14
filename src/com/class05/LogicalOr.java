package com.class05;

public class LogicalOr {

	public static void main(String[] args) {

		/*
		 * variable day
		 * 
		 * if day is tuesday or wednesday----> manuel class if day is monday or friday
		 * -----> no class if day is saturday or sunday -----> java class if day is
		 * thursday -----> review class
		 */

		String day = "Saturday";

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today I have no class");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today I have Manuel class");
		} else if (day.equals("Thursday")) {
			System.out.println("Today I have Review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today is Java class");
		} else {
			System.out.println(day + " is invalid");
		}

	}

}
