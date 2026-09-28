package Mathematics;

// we have to check whether a number (Integer) is palindrome or not
// if the number is palindrome print "true" otherwise "false"

// time complexity here : O(n)
// space complexity here : O(1)

public class PalindromeNumber {
    public static boolean checkPalindrome(int x) {
        int original = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return reverse == original;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(12321));
    }
}
