package Mathematics;

public class PascalsTriangle2 {

// if we are asked to print a particular row of the pascal's triangle
// here n is row number + 1 (zero based indexing)
// time complexity here = O(n)
// space complexity here = O(1)

// we also have a brute force approach:
// first, create the entire pascal's triangle (nCr) and then print the particular row
// but in the brute force approach time complexity is = O(n*r)
// here n is for row and r is for column 

    static void printEntireRow(int n) {
        int resultant = 1;
        System.out.print(resultant + " ");
        for (int i = 1; i < n; i++) {
            resultant = resultant * (n - i);
            resultant = resultant / i;
            System.out.print(resultant + " ");
        }
    }

    public static void main(String[] args) {
        printEntireRow(5);
    }
}
