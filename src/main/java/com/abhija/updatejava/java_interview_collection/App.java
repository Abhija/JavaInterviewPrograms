package com.abhija.updatejava.java_interview_collection;

import com.abhija.updatejava.java_interview_collection.generic.NumberSwap;
import com.abhija.updatejava.java_interview_collection.generic.PrimeNumberCheck;
import com.abhija.updatejava.java_interview_collection.strings.StringReversal;
import com.abhija.updatejava.java_interview_collection.strings.VowelCheck;

public class App {

	public static void main(String[] args) {
		System.out.println("1. String reversal of NOTIFICATION "+ new StringReversal().reverseString("NOTIFICATION"));
		System.out.println("2. NUmber swap of 1 and 2 ");
		 new NumberSwap().swapNumbers(1, 24);
		 System.out.println("3. Vowels Check for Apple "+ new VowelCheck().checkVowelPresent("apple"));
		 System.out.println("3. Vowels Check for Apple "+ new VowelCheck().checkVowelPresent2("apple"));
		 System.out.println("4. Verify for Primenumber "+ new PrimeNumberCheck().checkPrimeNumber(23));

	}

}
