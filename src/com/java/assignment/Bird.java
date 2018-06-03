package com.java.assignment;

public class Bird extends Animal {	

	static{
		animalName = "Bird";
	}
	
	public Bird() {		
		super();
		canFly = true;
		canSing = true;
	}

	void fly() {
		System.out.println("I am flying");
	}

}
