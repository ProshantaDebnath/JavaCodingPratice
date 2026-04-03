package core.java.string;

import java.util.Arrays;

public class TwoStringsAnagrams {
	
	public static void main(String[] args) {
		
		String str1 = "Hellow", str2 = "Hellow";
		
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		
		System.out.println(Arrays.equals(str1Char, str2Char) ? "Anagrams" : "Not Anagrams");
		
	}

}
