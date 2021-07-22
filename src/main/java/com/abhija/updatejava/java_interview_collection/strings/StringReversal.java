package com.abhija.updatejava.java_interview_collection.strings;

/**
 * CONCEPTS COVERED : Basic String operation, Exception handling
 * @author abhija.j
 *
 */
public class StringReversal {

	/**
	 * String reversal method Using StringBuilder instead of the String because
	 * StringBuilder is a mutable object When we made a change in existing
	 * mutable objects, no new object will be created; instead, it will alter
	 * the value of the existing object
	 * https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/
	 * It is better to add exception handling also in this program for null
	 * check https://beginnersbook.com/category/technology/java-guide/exception-handling/
	 * 
	 * @param inputString
	 * @return reversed string
	 * @throws Exception
	 */
	public String reverseString(String inputString) {
		StringBuilder stringbuilder = new StringBuilder();
		if (inputString == null) {
			throw new IllegalArgumentException("The input String is null");
		}
		char[] stringToCharArray = inputString.toCharArray();
		for (int i = stringToCharArray.length - 1; i >= 0; i--) {
			stringbuilder.append(stringToCharArray[i]);
		}

		return stringbuilder.toString();

		// Alternative
		/**
		 * try { char[] stringToCharArray = inputString.toCharArray(); for (int
		 * i = stringToCharArray.length - 1; i >= 0; i--) {
		 * stringbuilder.append(stringToCharArray[i]); }
		 * 
		 * } catch (NullPointerException e) { System.out.println("WARNING : The
		 * string is null"); }
		 * 
		 * return stringbuilder.toString();
		 */

	}

}
