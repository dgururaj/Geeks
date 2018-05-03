package problems;

public class ReversingArrays {

	static void ReverseArray(int[] arr, int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		ReverseArray(arr, start + 1, end - 1);
	}

	static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]);
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		// printArray(arr, arr.length);
		System.out.println(arr.length - 1);
		ReverseArray(arr, 0, 5);
		printArray(arr, arr.length);

	}

}
