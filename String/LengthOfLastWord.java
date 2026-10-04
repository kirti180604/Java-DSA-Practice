package String;

// we are asked to find the length of the last word in a string
// time complexity here: O(n)
// space complexity here: O(1)

public class LengthOfLastWord {
    public static int lastWordLength(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            }
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("length of last word is: " + lastWordLength(s));
    }
}
