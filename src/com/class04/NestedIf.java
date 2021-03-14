package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = true;

		boolean classToday = true;
		// is it morning?-->Good morning
		// if there is class:yes--->hello classmates
		// otherwise---> hello my family

		if (morning) {
			System.out.println("Let me check if i have class today");
			if (classToday) {
				System.out.println("Good morning my classmates");
			} else {
				System.out.println("Good morning my family");
			}

		}

		System.out.println("---- End of the code ----");

		
		boolean anyAllergy=false;
		boolean pollenAllergy=true;
		
		if(anyAllergy) {
			
			System.out.println("Let's check which allergies you have");
			if (pollenAllergy) {
				System.out.println("Do not get close to trees");
			}else {
				System.out.println("Ok i know you do not have pollen allergy");
			}
			
			
			
		}else {
			System.out.println("You're lucky not having any allergies");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}