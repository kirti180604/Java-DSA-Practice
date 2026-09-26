package Mathematics;
public class PascalsTriangle {
    // if we are asked what value is present on the rowno n and colno r in pascals traingle
    // time complexity here = O(r)
    // space complexity here = O(1)

    // if we solve this question with the brute force approach:
    // formula for every value of pascals triangle:- nCr = (n)! / (r)! * (n-r)!
    // here n = no of row - 1
    // and r = no of cols - 1
    // means first print the entire pascal's triangle and then print this value then 
    // time complexity will be = O(n) + O(r) + O(n-r) which is so much
    static int pascal(int n, int r) {
        int resultant = 1;
        for (int i = 0; i < r; i++) {
            resultant = resultant * (n - i);
            resultant = resultant / (i + 1);
        }
        return resultant;
    }

    public static void main(String[] args) {
        int value = pascal(4, 2);
        System.out.println(value);
    }
}