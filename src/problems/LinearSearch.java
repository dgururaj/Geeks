package problems;

import java.util.Scanner;

public class LinearSearch {
	static int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
			// is found
			if (arr[i] == x)
				return i;
		}

		// return -1 if the element is not found
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			System.out.println("Enter the Size:");
			int n = sc.nextInt();
			System.out.println("Enter the Array values:");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the Element to Search:");
			int x = sc.nextInt();
			System.out.println(search(arr, n, x));

			t--;
		}

	}

}
