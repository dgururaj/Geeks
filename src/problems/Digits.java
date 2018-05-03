package problems;

import java.util.Scanner;

public class Digits {
	public int count;
	public int CheckMaxDigi() {
		

		Scanner sc = new Scanner(System.in);
		long Num = sc.nextLong();
		
		char c = sc.next().charAt(0);
		
		String tez = Long.toString(Num);
		char arr[] = tez.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]==c){
				count++;
			}
		}
		return count;

	}

}
