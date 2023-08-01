import java.util.*;

public class mergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m, i=0, j=0;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(i=0; i<n1; i++)
            left[i] = arr[l+i];
        for(j=0; j<n2; j++)
            right[j] = arr[m+1+j];
        i=0;
        j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=left[i];
            i++;k++;
        }
        while(j<n2)
        {
            arr[k]=right[j];
            j++;k++;
        }
    }

    void sort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n,i,x;
        System.out.print("Enter size of array: ");
        n = s.nextInt();
        long start, end, diff;
        int[] array = new int[n];
        Random r = new Random();
        for(i=0;i<n;i++)
        {
            x=r.nextInt(1000);
            array[i]=x;
        }
        System.out.print("\nArray before sorting: ");
        for(int a:array)
            System.out.print(a+" ");

        start=System.nanoTime();
        mergeSort ob = new mergeSort();
        ob.sort(array, 0, array.length-1);
        System.out.print("\nSorted array: ");
        for(int a:array)
            System.out.print(a+" ");
        end=System.nanoTime();

        diff=end-start;
        System.out.print("\nTime taken: "+diff);
    }
}
