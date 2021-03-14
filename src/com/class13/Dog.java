package com.class13;

public class Dog {

	public String breed;
	public String size;
	public String color;
	public int age;
	
	public void bark() {
		System.out.println("ruff ruff ruff");
	}
	
	public void sleep() {
		System.out.println("ZZZZZZZzzzzzz.....");
	}
	
	public void eat() {
		System.out.println("eating......");
	}
	
	public void look() {
		System.out.println("Hi i am a dog my color is "+color);
	}
	
	
	public static void main(String[] args) {
		
		
		Dog bullDog=new Dog();
		bullDog.age=10;
		bullDog.breed="American Bulldog";
		bullDog.size="Large";
		bullDog.color="Pink";
		bullDog.bark();
		bullDog.sleep();
		bullDog.eat();
		bullDog.look();
		
		Dog beagle=new Dog();
		beagle.age=8;
		beagle.breed="beagle";
		beagle.size="Large";
		beagle.color="Light grey";
		beagle.look();
		
		
		
		
	}

}
