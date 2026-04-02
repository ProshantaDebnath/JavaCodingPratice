package core.java.string;

import java.util.*;

public class CheckViowel {
	
	public static void main(String[] args) {
		
		String str = "testai";
		String vowelChar = "AEIOUaeiou";
		Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
		int count = 0;
		List<Character> vowelList = new ArrayList<>();
		
		for(char c : str.toCharArray()) {
			if(vowelChar.contains(String.valueOf(c))) {
				count++;
			}
		}
		
		for(char c : str.toCharArray()) {
			if(vowels.contains(c)) {
				vowelList.add(c);
			}
		}
		
		
		System.out.println("Vowel Char count : " + count);
		System.out.print("VowelList : " + vowelList);
		
	}

}
