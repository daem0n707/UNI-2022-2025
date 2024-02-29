//Given two arrays, merge them such that the resultant array is sorted
//Note: Given arrays are sorted by default
//In the given example, the merged array would be: {1,2,2,3,5,6}
//m and n are sizes of arrays nums1 and nums2 respectively

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] >= nums1[i]) 
	    {
                nums1[index] = nums2[j];
                j--;
            } 
	    else 
	    {
                nums1[index] = nums1[i];
                i--;
            }
            index--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
