package problems;

public class RotateArrays {

	public static int i, temp;

	static void RotationDegree(int[] arr, int d) {
		for (int i = 0; i < d; i++) {
			LeftRotate(arr);
			
		}
		PrintArray(arr);
	}

	static void LeftRotate(int[] arr) {
		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
			arr[i] = temp;
	}

	static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,10,19,3,4,12};
		PrintArray(arr);
		RotationDegree(arr,2);
		
	}

}
