package TwoPointer;

// in this question we have given a sorted array as input
// and we have to find the number of unique values as output and return the exact count of unique numbers

// time complexity here: O(n)  (The for loop checks each array element at most once)
// space complexity here: O(1) (modify the original array without creating another array)

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }
}
