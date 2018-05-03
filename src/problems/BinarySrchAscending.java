package problems;

public class BinarySrchAscending {
	
	
	int binarySearch(int arr[],int x) {
		int l=0;
		int r=arr.length-1;
		
		
		while (l<=r) {
		int m = l+(r-l)/2;
		
		if(arr[m]==x) {
			System.out.println("Position of '"+x+"'is @ "+m);
			return m;
		}
		if(arr[m]<x) {
			l = m+1;
		}
		else {
			r= m-1;
		}
		
		}	
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySrchAscending ob = new BinarySrchAscending();
		
		int arr[] = {2,3,4,10,40};
		int x= 2;
		if (ob.binarySearch(arr, x)==-1){
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element is present");
		}
		
		

	}

}
