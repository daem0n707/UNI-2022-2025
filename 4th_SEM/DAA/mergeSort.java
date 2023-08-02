import java.util.*;

public class mergeSort {
    public static void merge(int[] arr) {
        if (arr.length>1) {
            int mid = arr.length/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            merge(left);
            merge(right);
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i]<right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int n,i,x;
        long start, end, diff;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        Random r = new Random();
        for(i=0;i<n;i++)
        {
            x=r.nextInt(1000);
            arr[i]=x;
        }
        System.out.print("\nArray before sorting: ");
        System.out.print(Arrays.toString(arr));
        start=System.nanoTime();
        merge(arr);
        end=System.nanoTime();
        System.out.print("\nSorted array: ");
        System.out.print(Arrays.toString(arr));
        diff=end-start;
        System.out.print("\nTime taken: "+diff);
    }
}
