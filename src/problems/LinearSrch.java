package problems;

import java.util.Scanner;

public class LinearSrch {

	static int search(int arr[], int n, int x) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				System.out.println(x+" is present");
				return 1;
			}
		}
		System.out.println(x+" is not present");
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of test cases::");
		int t = sc.nextInt();

		while (t > 0) {
			System.out.println("Enter size of the array::");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();

			}
			System.out.println("Enter the Number to Search::");
			int x = sc.nextInt();
			System.out.println(search(arr, n, x));
			
		t--;	
		}

	}

}
