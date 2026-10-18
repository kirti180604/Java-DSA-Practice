import java.util.Arrays;

// here in this question we are asked to find how many numbers are smaller than the the current number and return
// the count of smaller numbers in the output in a new array 

// time complexity here: 0(n^2) (nested loop)
// space complexity here: 0(n) (because we created a new array of size n)

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public int[] numbersSmallerThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        HowManyNumbersAreSmallerThanCurrentNumber obj = new HowManyNumbersAreSmallerThanCurrentNumber();
        System.out.println(Arrays.toString(obj.numbersSmallerThanCurrent(nums)));

        // We create an object to call the instance method, then use Arrays.toString()
        // to convert the
        // returned array into readable text before printing it.

        // Because numbersSmallerThanCurrent() is a non-static method, we need an object
        // to call it;
        // if it were static, we could call it directly using the class name.

    }
}