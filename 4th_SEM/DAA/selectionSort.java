package kanishk;
import java.util.*;

public class selectionSort {

	public static void main(String[] args) {
		int n, i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Elements in the array are: ");
		Random r = new Random();
		for(i=0; i<n; i++)
		{
			arr[i] = r.nextInt(100);
			System.out.print(arr[i]+" ");
		}
		
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
		System.out.print("\nSorted Elements: ");
		for(i=0; i<n; i++)
			System.out.print(arr[i]+" ");	
		System.out.print("\n");
		System.out.print("Execution taken: " + (end-start));
	}

}

