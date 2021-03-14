package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		int[] array = new int[5];

		array[0] = 10;
		array[1] = 12;
		array[2] = 15;
		array[3] = 9;
		array[4] = 13;

		System.out.println(array[2]);

		System.out.println(array[0] + array[4]);

		double[] numbers = new double[2];

		numbers[0] = 10.99;
		numbers[1] = 19.01;

		numbers[0] = 11.99;// reassign

		System.out.println(numbers[0]);

		// ARRAYS are fixed in size
		String[] names = new String[3];
		names[0] = "Johanzeb";
		names[1] = "Tolga";
		names[2] = "Ozoda";

		System.out.println(names[1]);
		
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		
		System.out.println(b[2]);
		
		int size=b.length;
		System.out.println("Size of an array is "+size);
		
		
		

	}

}
