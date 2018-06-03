package com.java.assignment;

import java.util.Locale;
import java.util.ResourceBundle;

public class Animal {

	static String animalName;
	// hard coding locale for testing (actual locale will be system locale)
	static Locale locale = new Locale("en", "US");
	static ResourceBundle animalsound = ResourceBundle.getBundle("animalsound", locale);

	static String sound;

	boolean canWalk = true;
	boolean canSound = true;
	boolean canFly = false;
	boolean canSing = false;
	boolean canSwim = false;

	public Animal() {
		System.out.println("A new " + animalName + " has been created!");

	}

	void walk() {
		if (canWalk) {
			System.out.println("I am walking");
		} else {
			System.out.println("I can not walk");
		}
	}

	void sound() {
		if (canSound) {
			System.out.println(sound);
		} else {
			System.out.println("I can not sound...");
		}
	}

	void swim() {
		if (canSwim) {
			System.out.println("I can swim");
		} else {
			System.out.println("I can not swim...");
		}
	}
	
	void sing() {
		if (canSing) {
			System.out.println("I am singing");
		} else {
			System.out.println("I can not sing...");
		}
	}
}
