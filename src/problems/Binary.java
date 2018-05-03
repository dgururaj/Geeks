package problems;

public class Binary {

	int binarySearch(int arr[], int x) {

		int l=0;
		int r = arr.length-1;
		
		while (l<=r) {
			
			int m = l+(r-l)/ 2;
			if(arr[m]==x) {
				System.out.println(m);
				return m;
			
				
			}
			if(arr[m]<x) {
				l = m+1;
			}
			if(arr[m]>x) {
				r = m-1;
			}
			
		}
		
		
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary ob = new Binary();
		
		int arr[] = {1,2,3,4,5,6};
		int x = 6;
		if (ob.binarySearch(arr, x)==-1) {
			
			System.out.println("Element is not found");
		}
		
		else {
			System.out.println("Element is found");
			
		}
	}

}
