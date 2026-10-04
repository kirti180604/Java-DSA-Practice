package Basics;
import java.util.Arrays;

// here we have to concate (add) an array
// means arr -> arr + arr
// [1,2,3] -> [1,2,3,1,2,3]
// time complexity here: O(n) — we visit each element once (for loop).
// space complexity here: O(n) — we create a new array of size 2n.

public class ConcatenationOfArray {
    public static int[] concatenationOfArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] ans = concatenationOfArray(nums);
        System.out.println(Arrays.toString(ans));

// if we write
// System.out.println(concatenationOfArray(nums));
// it will not print the array it will print the array reference @2f7#49 somthing like
// this because Java treats an array as an object and System.out.println() prints
// its reference instead of automatically displaying its elements.
// thats why we have to use Arrays.toString()
// System.out.println(array) prints the array's reference.
// Arrays.toString(array) prints the actual elements in the array.

    }
}
