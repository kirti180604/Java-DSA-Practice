package String;

import java.util.Arrays;
import java.util.Scanner;

// Anagram : An anagram is a word or phrase made by rearranging the exact same
// letters from another word or phrase
// earth -> heart
// elbow -> below
// this approach is case-sensitive, so Earth and heart are not considered anagrams.
// means Earth -> Heart (not an anagram)
// earth -> heart (anagram)

// here we have to check whether the given strings are anagram or not

// time complexity here: O(n log n) because sorting both character arrays takes O(n log n)
// space complexity here: O(n) because toCharArray() creates two new arrays of length n

public class ValidAnagram {
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);

        System.out.print("choose string s: ");
        String s = sc.next();

        System.out.print("choose string t: ");
        String t = sc.next();

        if (checkAnagram(s, t)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }

        sc.close();

        // If you don't use sc.close(), your program will still work perfectly fine; the
        // Scanner
        // just remains open until it is closed or the program terminates. For small
        // programs like
        // LeetCode problems, you generally don't need to worry about it, but closing
        // resources is
        // a good practice in larger applications.

        // Note: Avoid closing sc if you still need to use System.in later, because
        // closing the
        // Scanner also closes the underlying input stream.

    }

}
