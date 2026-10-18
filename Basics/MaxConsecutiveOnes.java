package Basics;

// in this question we are asked to find consecutive one's in an binary array
// and return the count of the maximum number of consecutive one's

// for eg: [1, 1, 0, 1, 1, 1]
// output: 3

// time complexity here: 0(n)  (the loop visits n elements)
// space complexity here: 0(1)  (used a constant amount of extra space)

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else if (nums[i] == 0) {
                count = 0;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };

        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}
