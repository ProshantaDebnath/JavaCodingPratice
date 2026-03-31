package core.java.basic;

public class SwapTwoNumberWith3rdVariable {

	public static void main(String[] args) {
		int a = 10, b = 5;
		
		a = a + b; //15
		b = a - b; // 10
		a = a - b; // 5	
		System.out.println("After Swap : " + a + " " + b);
	}
}
