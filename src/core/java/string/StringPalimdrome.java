package core.java.string;

public class StringPalimdrome {
	
	public static void main(String[] args) {
		
		String str = "madam";
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse.equals(str) ? "Palimdrome" : "Not Palimdrome");
		
	}

}
