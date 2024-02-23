public class selectionSort {

	public static void main(String[] args) {
		int n, i, j;
		int arr[] = {52, 66, 32, 45, 16};
		n = arr.length;
		
		double start = System.nanoTime();
		for(i=0; i<n-1; i++) {
			int min=i;
			for(j=i+1; j<n; j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			if(i!=min)
			{
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		double end = System.nanoTime();
		
		System.out.print("Sorted Elements: ");
		for(i=0; i<n; i++)
			System.out.print(arr[i]+" ");	
		System.out.print("\nExecution taken: " + (end-start));
	}

}
