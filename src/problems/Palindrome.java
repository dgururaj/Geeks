package problems;

import java.lang.reflect.Array;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbccdd";
		int count = 0;

		char[] ch = s.toCharArray();
		char[] temp;
		for (int i = 0; i <= ch.length - 1 - 1; i++) {
			ch[i] = ch[i + 1];
			count++;

		}

	}

}
