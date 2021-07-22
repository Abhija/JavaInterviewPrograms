package com.abhija.updatejava.java_interview_collection.generic;

public class NumberSwap {

	/**
	 * Swap a number without using a third variable Always use a pen and paper
	 * calculations for this kind of programs
	 * 
	 * @param a
	 * @param b
	 */
	public void swapNumbers(int a, int b) {
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println("First number and second number is swapped to " + a + " " + b);
	}

	// JAVA IS PASS BY VALUE, SO THE BELOW CODE WON'T WORK
	// Java creates a copy of the variable being passed in the method
	// and then do the manipulations. Hence the change is not reflected
	// in the main method.
	/**
	 * public static void swapNumbers(int a, int b) { b = a + b; a = b - a; b =
	 * b - a; System.out.println("First number and second number is swapped to "
	 * + a + " " + b); }
	 * 
	 * public static void main(String[] args) { int a = 10; int b = 20;
	 * swapNumbers(a, b); System.out.printf("a is %d, b is %d", a, b); // a is
	 * 10, b is 20 }
	 */

}
