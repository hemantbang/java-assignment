package com.java.assignment;


//instead of inheritance Rooster can be constructed by composition
public class RoosterWithoutInheritance  {
	
	private Animal animal;
	
	public RoosterWithoutInheritance(){
		Animal.animalName = "Rooster";		
		Animal.sound = Animal.animalsound.getString("Rooster");
		animal = new Animal();
	}
	
	void sound(){
		animal.sound();
	}

}
