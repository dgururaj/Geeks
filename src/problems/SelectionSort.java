package problems;

public class SelectionSort {

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min_idx = i;
			for (int j = i+1; j < arr.length; j++)
				if(arr[j]<arr[min_idx]){
					min_idx=j;
				}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i]=temp;
			
		}
		System.out.println("Array Sorted by selection sort");
		PrintArray(arr);
	}

	static void PrintArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ob = new SelectionSort();
		int arr[] = { 45, 10, 25, 8, 56 };
		PrintArray(arr);
		ob.sort(arr);
		
	}

}
