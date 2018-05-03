package problems;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello";
		String b = "World";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("Value of B after swap::"+b);
		System.out.println("Value of A after swap::"+a);
	}

}
