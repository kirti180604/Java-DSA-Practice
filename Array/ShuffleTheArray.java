import java.util.Arrays;

public class ShuffleTheArray {

    // shuffle the array like this:
    // input -> [2,5,1,3,4,7], n = 3
    // output -> [2,3,5,4,1,7]

    // time complexity here : O(n)
    // space complexity here : O(n) because you create a new result array

    public static int[] shuffleTheArray(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            index++;
            result[index] = nums[i + n];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12 };
        System.out.println("input array: " + Arrays.toString(nums));
        int n = nums.length / 2;
        String ans = Arrays.toString(shuffleTheArray(nums, n));
        System.out.println("shuffled array: " + ans);
    }
}
