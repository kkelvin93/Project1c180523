package org.base;

public class AddStringAndReverseString {

	public static void main(String[] args) {

		String s = "java";
		// String s1 = "";
		// s1 = s + s1;
		System.out.println(10 + 20 + "java");
		System.out.println("java" + 10 + 20);
		System.out.println(10 + 20 + "java" + 10 + 20);
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length() - 1));

		// To store the output string to avoid concat effect
		String output = "";
		// output = output+s.charAt(0)+s.charAt(s.length()-1);
		// System.out.println(output);

		// Reverse the string
		System.out.println("***To print the reversed value in line***");
		for (int i = s.length() - 1; i >= 0; i--) {
			output = output + s.charAt(i);

			System.out.println(s.charAt(i));

		}

		// To print reverse value in string

		System.out.println("***To print the reversed value in String***");
		System.out.println(output);

	}

}