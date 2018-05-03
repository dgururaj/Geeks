package problems;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		int negsum = 0;

		if (y > 0) {
			while (y > 0) {
				sum = sum + x;
				y--;
			}
			System.out.println(sum);
		} else {
			while (y < 0) {

				negsum = negsum + x;

				y++;
			}
			negsum = -negsum;
			System.out.println(negsum);
		}

	}

}
