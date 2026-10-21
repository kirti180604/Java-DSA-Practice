package TwoPointer;

import java.util.Arrays;

// in this question we have given an array nums and a target element "val" to remove
// and the numbers which are unique will be considered as k

// time complexity here: O(n)
// space complexity here: O(1)

public class RemoveElements {
    public static int removeElements(int[] nums, int val) {
        if (nums.length == 0) { // val is the target value which we are going to remove
            return 0;
        }
        int k = 0; // k denotes the value of the nums array which is not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 7, 4, 8, 4, 9 };
        int val = 4;
        int k = removeElements(nums, val);
        System.out.println("count of unique values: " + k);
        System.out.print("unique values: " + Arrays.toString(Arrays.copyOf(nums, k)));
        System.out.println();
    }
}
