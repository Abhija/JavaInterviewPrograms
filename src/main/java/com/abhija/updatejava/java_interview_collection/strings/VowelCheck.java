package com.abhija.updatejava.java_interview_collection.strings;

public class VowelCheck {

	/**
	 * This method uses regexpression
	 * 
	 * @param input
	 * @return
	 */
	public boolean checkVowelPresent(String input) {
		if (input.toLowerCase().matches(".*[aeiou].*"))
			return true;
		else
			return false;
	}

	/**
	 * This method can also be used to check vowel in a string
	 * 
	 * @param input
	 * @return boolean vowel is present or not
	 */
	public boolean checkVowelPresent2(String input) {
		String vowels = "aeiou";
		char[] vowelsArray = vowels.toCharArray();
		input = input.toLowerCase();
		for (int i = 0; i < vowelsArray.length; i++) {
			if (input.contains(Character.toString(vowelsArray[i])))
				return true;
		}
		return false;

	}

}
