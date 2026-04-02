package core.java.string;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		
		String str = "Hellow12457";
		
		char[] strCharArray = str.toCharArray();
		
		Arrays.sort(strCharArray);
		
		String sortedStr = new String(strCharArray);
		
		System.out.println("SortedStr : " +  sortedStr);
		
	}

}
