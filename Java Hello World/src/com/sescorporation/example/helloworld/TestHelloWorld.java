package com.sescorporation.example.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestHelloWorld {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInterpretLanguage() throws Exception {
		assertEquals(Advanced.interpretLanguage("de"), "Hallo Welt!");
	}
	
	@Test
	public void alwaysFails() {
		fail("This test always fails.");
	}
	
	@Test
	public void alwaysThrowsException() throws Exception {
		throw new Exception("This method always throws this exception.");
	}

}
