package String;

// here we have to check how many numbers are there in the array which has the sum of digits is even
// we are returning the count of numbers which have even digits.

// time complexity here: O(n) 
// The outer loop runs n times, and the inner loop counts at most 6 digits per number
// space complexity here: O(1)

public class findNumbersWithEvenNumberOfDigits {
    public static int findNumber(int[] nums) {
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                count++;
            }

            if (count % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 3425, 654, 1, 6537 };
        System.out.println(findNumber(nums));
    }
}
