package com.java.assignment;

public class Chicken extends Bird{
	
	static{
		animalName = "Chicken";
		sound = animalsound.getString(animalName);
	}
	
	public Chicken(){
		super();		
		canFly = false;
	}

}
