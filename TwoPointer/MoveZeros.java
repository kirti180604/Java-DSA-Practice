package TwoPointer;

import java.util.Arrays;

// in this question we have to move all the zeros in the end of the array and
// all the non-zero values in the start of the array, without changing the order.

// time complexity here: O(n)
// space complexity here: O(1)

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int j = 0;
        // j points to the next position where a non-zero value will be placed
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 2, 5 };
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
