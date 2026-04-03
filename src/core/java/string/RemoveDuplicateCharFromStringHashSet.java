package core.java.string;

import java.util.*;

public class RemoveDuplicateCharFromStringHashSet {


	// Comparatively Fast Method using Set
	public static StringBuilder MethodOne(String str) {
		
		StringBuilder finalStr = new StringBuilder();
		
		Set<Character> set = new LinkedHashSet<>();

		for (char c : str.toCharArray()) {
			set.add(c);
		}

		for (char ele : set) {
			finalStr.append(ele);
		}

		return finalStr;
	}
	
	//Slow but without using HashSet
	
	public static StringBuilder MethodTwo(String str) {
		
		StringBuilder finalStr = new StringBuilder();
		
		List<Character> FinalArrayList = new ArrayList<>();
		
		for(char c : str.toCharArray()) {
			if(!FinalArrayList.contains(c)) {
				FinalArrayList.add(c);
			}
		}
		
		for(char listele : FinalArrayList) {
			finalStr.append(listele);
		}
				
		return finalStr;
	}

	public static void main(String[] args) {

		System.out.println("Final String Method 1: " + MethodOne("TestHello"));
		System.out.println("Final String Method 2: " + MethodTwo("TestHello"));
		
		

	}

}
