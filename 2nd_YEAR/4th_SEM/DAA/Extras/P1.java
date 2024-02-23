//Given an array, sort it such that all the negative numbers occur before positive numbers without sorting.
//EG: Before: {-3, -7, 2, 1, -9, -45, 3, -6}
//	  After:  {-3, -7, -9, -45, -6, 2, 3, 1}

public class misc {
	static void swap(int a[], int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	static void position(int arr[], int p, int r) {
		int x = arr[r];
		int i = p-1; 
		for(int j=p; j<=r; j++)
		{
			if(arr[j] < 0)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
	}
	
	public static void main(String[] args) {
		int arr[] = {-3, -7, 2, 1, -9, -45, 3, -6};
		position(arr, 0, arr.length-1);
		for(int k=0; k<arr.length; k++)
			System.out.print(arr[k]+" ");

	}

}

