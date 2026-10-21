package TwoPointer;

// in this question we have given an integer array nums and the value of k
// here k denotes the number of steps we need to rotate to the right
// we are asked to return the rotated arrays which is rotated with k steps
// here k is a non-negative integer

// time complexity here: O(n) + O(k) + O(n-k) = O(n)
// We reverse the array in three method calls, and together they take linear time
// space complexity here: O(1)
// We modify the original array and use only a temporary variable for swapping

import java.util.Arrays;

public class RotatedArray {
    public static void reverse(int[] nums, int first, int last) {
        while (first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;

        }
        // System.out.println(Arrays.toString(nums));
    }

    public static int[] rotatedArray(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        // reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(rotatedArray(nums, k)));

        // We don't need to write a for loop just because we're working with an array,
        // Java's Arrays.toString() does the printing work for us.

    }
}
