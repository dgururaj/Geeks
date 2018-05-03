package problems;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("Enter the number of test cases to execute");
		int t = sc.nextInt();

		while (t > 0) {
			System.out.println("Enter the Str1");
			String str = sc.next();
			System.out.println("Enter the Str2");
			String str2 = sc.next();
			System.out.println("Concatenated string::"+str + str2);
			String con = str + str2;
			char[] arr= con.toCharArray();
			System.out.println("Length of the string::"+arr.length);
			int n = arr.length;
			for (int i=n-1;i >=0;i--) {
				
				
				result = result+arr[i];
				 
			}
			System.out.println("Reversed String::"+result);
			result="";
			t--;

		}

	}

}
