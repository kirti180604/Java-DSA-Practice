package Basics;

import java.util.Arrays;

public class TwoSum {
    // we are given an array of integers and a target value, we have to find a pair
    // of two indices
    // the sum of which is equal to the target
    // assuming that each array (input) would have exactly one solution
    static int[] SumOfTwo(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.print(Arrays.toString(SumOfTwo(nums, target)));
        System.out.println();
    }
}
