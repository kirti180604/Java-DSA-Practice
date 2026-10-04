import java.util.Arrays;

// here we are asked to print the running sum
// Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]

// time complexity here: O(n) — we traverse the array once (for loop)
// space complexity here: O(1) — updated the same array

public class RunningSumOf1DArray {

    public static int[] runningSumOf1DArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 12, 15 };
        System.out.println("nums: " + Arrays.toString(nums));
        int[] ans = runningSumOf1DArray(nums);
        System.out.println("Running Sum: " + Arrays.toString(ans));
    }
}
