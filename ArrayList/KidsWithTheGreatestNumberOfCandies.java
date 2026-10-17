package ArrayList;
import java.util.List;
import java.util.ArrayList;

// You are given an array candies, where each element represents the number of candies a kid has. 
// You are also given an integer extraCandies, which represents the extra candies you can give to a kid.
// For each kid, check whether giving them all the extra candies would make their total number of 
// candies greater than or equal to the maximum number of candies any kid currently has.

//If yes, add true to the result.
// If no, add false to the result.
// Return the result array.

// Note: Multiple kids can have the greatest number of candies.

// Time Complexity = 0(n)    [Two loops each traverse the array]
// Your code has two for loops:
// First loop: Finds the maximum number of candies. It visits all n kids, so O(n)
// Second loop: Checks each kid after adding extraCandies and stores true or false
// It also visits all n kids, so O(n)
// Total: O(n) + O(n) = O(2n) = O(n)
// We ignore constant factors like 2 in Big-O notation.

// Space Complexity = 0(n)   [The result list stores n Boolean values]
// Your code creates ans, a list that stores one Boolean value for every kid.
// ans stores n elements: O(n)
// Variables such as i and max use constant space: O(1)
// Therefore, the total auxiliary space complexity is: O(n) + O(1) = O(n)

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 5, 3, 7, 1 };
        int extraCandies = 3;

        KidsWithTheGreatestNumberOfCandies obj = new KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);

        System.out.println(result);


        // Case 1: Your method is non-static
        // public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
        // If you call it using the class name:
        // KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        // You will get a compile-time error, because a non-static method needs an object to be called this way.
        // Instead, use:
        // KidsWithTheGreatestNumberOfCandies obj = new KidsWithTheGreatestNumberOfCandies();
        //      obj.kidsWithCandies(candies, extraCandies);

        // Case 2: Your method is static
        // public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
        // Now you can call it directly using the class name:
        // KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        // No object required !!

        // Method type  	Call using class name?   	Call using object?
        // Non-static	       Not directly	                  Yes
        // Static	              Yes	                      Yes, but class name is preferred

        // Golden Rule: A class name can directly call a static method, but a non-static method needs an object.

    }
}
