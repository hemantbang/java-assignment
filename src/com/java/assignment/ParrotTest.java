package com.java.assignment;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class ParrotTest {

	private Parrot parrot;

	@Test
	public void testParrotSoundLivedWithDogs() {
		Dog dog = new Dog();
		parrot = new Parrot();
		parrot.sound = dog.sound;
		
		String expected = "Woof, woof";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		parrot.sound();
		String output = new String(outContent.toByteArray());
		assertEquals(expected.trim(), output.trim());
	}
	
	@Test
	public void testParrotSoundLivedWithCats() {
		Cat cat = new Cat();
		parrot = new Parrot();
		parrot.sound = cat.sound;
		
		String expected = "Meow";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		parrot.sound();
		String output = new String(outContent.toByteArray());
		assertEquals(expected.trim(), output.trim());
	}
	
	@Test
	public void testParrotSoundLivedNearRooster() {
		Rooster rooster = new Rooster();
		parrot = new Parrot();
		parrot.sound = rooster.sound;
		
		String expected = "Cock-a-doodle-doo";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		parrot.sound();
		String output = new String(outContent.toByteArray());
		assertEquals(expected.trim(), output.trim());
	}

	@Test
	public void testParrotSoundLivedNearDuck() {
		Duck duck = new Duck();
		parrot = new Parrot();
		parrot.sound = duck.sound;
		
		String expected = "Quack, quack";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		parrot.sound();
		String output = new String(outContent.toByteArray());
		assertEquals(expected.trim(), output.trim());
	}
	
	
	@Test
	public void testParrotSoundLivedNearPhone() {
		parrot = new Parrot();
		String phonesound = "Trin Trin";
		parrot.sound = phonesound;
		
		String expected = phonesound;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		parrot.sound();
		String output = new String(outContent.toByteArray());
		assertEquals(expected.trim(), output.trim());
	}
	
	
	
}
