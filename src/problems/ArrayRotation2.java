package problems;

public class ArrayRotation2 {
	
	static int temp , i;
	
	
	static void rotate(int[] arr,int d) {
		for (int i = 0; i < d; i++) {
			LeftArray(arr);
		}
		printArray(arr);
	}
	static void LeftArray(int[] arr) {
		temp=arr[0];
		for (i = 0; i < arr.length-1; i++)
			arr[i]=arr[i+1];
			arr[i]=temp;
			
	}
	
	static void printArray(int arr[]){
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 14, 8, 7, 59, 29, 2 };
		printArray(arr);
		rotate(arr, 2);
	}

}
