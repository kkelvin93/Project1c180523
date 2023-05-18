package org.base;

public class SplitString {

	public static void main(String[] args) {

		String s = "Hi how are you";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);

		}
		
		System.out.println("*****************");
		
		String output = "";
		for (int i = 0; i < words.length; i++) {
			//System.out.println(words[i]);
			String word = words[i];
			for (int j = word.length()-1; j >= 0 ; j--) {
				output = output+word.charAt(j);
				
			}
			
			output = output+" ";
			
			System.out.println(output);
			
			
		}
		

	}

}
