package core.java.basic;

public class FindMinMaxElementFromArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4,6, 6, 8,10};
		
		int max = arr[0], min = arr[0];
		
		for(int num : arr) {
			
			if(num > max) max = num ;
			if(num < min) min = num ;
			
		}
		
		System.out.println("Max : " + max );
		System.out.println("Min : " + min );
	}

}
