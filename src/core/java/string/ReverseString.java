package core.java.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Selenium";
		String reverse = "" ;
		
		//using for loop
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println("Reverse String : " + reverse);
		
		//without for loop - reverse method		
		String Reverse = new StringBuilder(str).reverse().toString();
		System.out.println("Reverse String : " + Reverse);
	}
}
