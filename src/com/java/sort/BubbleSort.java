package com.java.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,0,2,1,9,5};		
		Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int next = arr[i];
					arr[i] = arr[j];
					arr[j] = next;
					
				}
			}
		}
		
		System.out.println("Boublesort : " + Arrays.toString(arr));
		
	}

}
