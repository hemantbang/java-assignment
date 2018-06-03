package com.java.assignment;

public class Duck extends Bird {
	
	static{
		animalName = "Duck";
		sound =  animalsound.getString(animalName);
	}
	
	public Duck(){
		super();
		canSwim = true;
	}
}
