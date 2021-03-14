package com.class11;

public class Task2 {

	public static void main(String[] args) {
		
	String[][] cars= {
			{"Chevrolet","Tesla","Dodge"},
			{"Bmw","Mercedes","Audi"},
			{"Kia","Hyundai"},
			{"Lambo","fiat","Maserati"}		
	};
	
	for(int row=0; row<cars.length; row++) {
		for(int col=0; col<cars[row].length; col++ ) {
			System.out.print(cars[row][col]+" ");
		}
		System.out.println();
	}
	System.out.println("-------2ND WAY---------");
	
	for(String[] car:cars) {
		for(String car1:car) {
			System.out.print(car1+" ");
		}
		System.out.println();
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
