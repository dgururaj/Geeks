package problems;

public class SortSelection {

	public void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int min_dx = i;
			for (int j = i+1; j < arr.length; j++) 
				if(arr[j]<arr[min_dx]) {
					min_dx=j;
				}
			
			int temp = arr[min_dx];
			arr[min_dx] = arr[i];
			arr[i]=temp;
			
		}
		PrintArray(arr);

	}

	static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortSelection ob = new SortSelection();
		int arr[] = { 14, 8, 7, 59, 29, 2 };
		PrintArray(arr);
		ob.SelectionSort(arr);
	}

}
