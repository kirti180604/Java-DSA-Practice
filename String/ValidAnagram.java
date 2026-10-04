package String;

import java.util.Arrays;
import java.util.Scanner;

// Anagram : An anagram is a word or phrase made by rearranging the exact same letters from another word or phrase
// earth -> heart
// elbow -> below
// time complexity here: 
// space complexity here: 
public class ValidAnagram {
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("not an anagram");
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        System.out.println("anagram");
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        System.out.print("choose string s: ");
        String s = sc.next();
        System.out.println("string s: " + s);
        System.out.print("choose string t: ");
        String t = sc.next();
        System.out.println("string t: " + t);
        System.out.println(checkAnagram(s, t));
    }

}
