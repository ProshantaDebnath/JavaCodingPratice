package core.java.basic;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 4, 4, 6, 6, 9};
		List<Integer> duplicateElementArr = new ArrayList<>();
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j] && !duplicateElementArr.contains(arr[i])) {
					duplicateElementArr.add(arr[i]);
				}
			}
		}
		
		System.out.println("Duplicate Element Array : " + duplicateElementArr);
		
    }

}
