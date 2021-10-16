package com.simplilearn.workshop;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ApplicationTest {
	
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outputContent));
	}
	
	@Test
	@Ignore
	public void testApplicationMain() {
		Application.main(null);
		try {
			assertEquals("Welcome to new class" + System.getProperty("line.seperator"),outputContent.toString());
		}catch (AssertionError e) {
			fail("\"message\" is not \"Welcome to new class\"");
		}
	}
	
	@Test
	public void testApplicationConstructor() {
		try {
			new Application();
		}catch (Exception e) {
			fail("constructor failed!");
		}
	}
	
	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}
}
