package problems;

import java.util.regex.Pattern;

public class ReverseABigSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My Name is Gururaj";
		// Pattern pattern = Pattern.compile("\\s");
		String temp[] = name.split("\\s");
		for (int i = temp.length - 1; i >= 0; i--) {
			System.out.println(temp[i]);
		}
	}

}
