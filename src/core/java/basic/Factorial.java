package core.java.basic;

public class Factorial {
	
	public static void main(String[] args) {
		
		//Logic --- n = 5, the calculation is 1X2X3X4X5=120.
 
		int n = 5;
		int factorial = 1;
		for(int i = 1; i<=n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial : " + factorial);
	}

}
