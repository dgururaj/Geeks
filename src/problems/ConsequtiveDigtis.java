package problems;

import java.util.Scanner;

public class ConsequtiveDigtis {

	public static void main(String[] args) {
		int count = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		// sample input 10111001
		long num = sc.nextLong();
		String tex = Long.toString(num);
		char ch[] = tex.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == '0') {
				count = 0;
			} else {
				count++;
				result = Math.max(result, count);
			}
		}
		System.out.println(result);

	}

	

}
