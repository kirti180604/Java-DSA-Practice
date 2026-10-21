package TwoPointer;

import java.util.Arrays;

// in this question, we have given two arrays one is nums1 which is of size m+n and the second aray nums2 of size n
// here m is the actual number of elements present in nums1 and n is the actual number of elements present in nums2
// and now we have to return the nums1 array with all the elements merged of nums1 and nums2 in a sorted manner
// but the important part is: we have to modify nums1 in place, because merge() returns nothing (void)

// time complexity here: O(m+n)
// space complexity here: O(1)

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
