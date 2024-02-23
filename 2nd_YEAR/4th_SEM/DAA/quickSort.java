public class partitioning {
	static void swap(int a[], int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	static int position(int arr[], int p, int r) {
		int x = arr[r];
		int i = p-1;
		for(int j=p; j<r; j++)
		{
			if(arr[j] <= x)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}

	static void sort(int a[], int p, int r) {
		if(p<r)
		{
			int q = position(a, p, r);
			sort(a, p, q-1);
			sort(a, q+1, r);
		}
	}
	public static void main(String[] args) {
		int arr[] = {52, 66, 32, 45, 16};
		sort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
