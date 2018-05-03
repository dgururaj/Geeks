package problems;

public class ArrayRotation {
	static int i, temp;
	int l, m, r;

	static void rotate(int[] arr, int degree) {
		for (int i = 0; i < degree; i++) {
			leftRotateArray(arr);
		}
	}

	static void leftRotateArray(int arr[]) {

		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;

	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	int BinarySearch(int[] arr, int x) {
		l = 0;
		r = arr.length - 1;

		while (l <= r) {
			m = l + (r - l) / 2;
			if (arr[m] == x) {
				System.out.println(x + " is present at " + m);
				return 1;
			}
			if (arr[m] < x) {
				l = m + 1;
			} else {
				r = m - 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 2, 37, 4, 5, 67 };
		printArray(arr);
		rotate(arr, 2);
		printArray(arr);
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		printArray(arr);
		ArrayRotation obs = new ArrayRotation();
		int d = obs.BinarySearch(arr, 37);
		System.out.println(d);

		if (d == 1) {
			System.out.println("Value is present");

		} else {
			System.out.println("Value is not present");
		}
	}

}
