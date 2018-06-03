/**
 * 
 */
package com.java.assignment;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Hemant
 *
 */
public class TestBird {

	private Bird bird;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}

	/**
	 * Test method for {@link com.java.assignment.Bird#sing()}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	public void testFly() throws FileNotFoundException {
		String expected = "I am singing";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		bird.sing();
		String output = new String(outContent.toByteArray());
		assertEquals(expected.trim(), output.trim());
	}

}
