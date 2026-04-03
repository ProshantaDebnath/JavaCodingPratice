package core.java.basic;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int digit = 12345;
		int sum = 0;
		
		while(digit != 0) {
			sum += digit % 10;
			digit /= 10;			
		}
		
		System.out.println("Sum : " + sum);
		
		
	}

}
