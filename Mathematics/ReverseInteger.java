// Leetcode Problem Number = 7
package Mathematics;

// we are asked to reverse a 32-bit integer value
// time complexity here = O(d) here d = number of digits
// space complexity here = O(1)

public class ReverseInteger {
    public static int reverseIntegerValue(int x) {
        long ans = 0; // (while reversing, the range should not exceed)
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE ? 0 : (int) ans);
    }

    public static void main(String[] args) {
        System.out.print(reverseIntegerValue(123));
        System.out.println();
    }
}
