package core.java.basic;

public class FactorialRecursive {
	
	//logic n!=nX(n-1)X(n-2).....X1
	
	public static int Factorial(int n) {
		
		if(n <= 1)
			return 1;
		
		return n*Factorial(n-1);
		
	}

	public static void main(String[] args) {
		int n = 5;
		int factorial = Factorial(n);
		System.out.println("Factorial : "+factorial);
		
	}
}
