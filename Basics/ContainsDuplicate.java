package Basics;

import java.util.Arrays;

// the question is to check whether any of the element comes two or more than two times in the array
// eg: arr = [1,2,3,4,3] (3 comes 2 times so the output will be true)
// if arr = [4,3,6,9,1] (all elements are unique so the output here will be false)
// time complexity here: 
// space complexity here: 

public class ContainsDuplicate {
    public static boolean duplicateOrNot(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.println("contains duplicate");
                return true;
            }
        }
        System.out.println("does not contain duplicate");
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 6, 8, 4 };
        System.out.println(duplicateOrNot(nums));
    }
}
