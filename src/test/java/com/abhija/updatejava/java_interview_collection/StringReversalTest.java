package com.abhija.updatejava.java_interview_collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.abhija.updatejava.java_interview_collection.strings.StringReversal;

public class StringReversalTest {

	String input = "NOTIFICATION";
	StringReversal stringReversal = new StringReversal();

	@Test
	public void testCorrectWorking() {
		assertEquals("NOITACIFITON", stringReversal.reverseString(input));
	}

	@Test
	public void testErrorWorking() {
		assertNotEquals("NOITACIFION", stringReversal.reverseString(input));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullPointerException() {
		stringReversal.reverseString(null);
	}

}
