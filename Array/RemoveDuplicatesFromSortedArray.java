// we have to print the unique value array from a sorted array 

// time complexity here : O(n) + O(n) = O(n)
// space complexity here : O(1)

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        // k is the number of unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 4, 7, 8, 8, 9 };

        int k = removeDuplicates(nums);
        System.out.println("number of unique elements: " + k);
        System.out.print("unique array: [");

        for(int i=0; i<k; i++) {
            System.out.print(nums[i]);

            if(i < k-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}