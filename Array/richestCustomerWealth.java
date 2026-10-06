public class RichestCustomerWealth {
    // here we have given a matrix (2D-Array) in which:
    // row -> customers
    // column -> bank
    // we have to calculate each customer's wealth from all of his/her banks and
    // then
    // check which customer is the richest.
    // time complexity here: O(n^2)
    // space complexity here: O(1)
    public static void richestCustomer(int[][] accounts) {
        int max = 0;
        int richestCustomer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > max) {
                max = sum;
                richestCustomer = i;
            }
        }
        System.out.println("customer " + richestCustomer + " is richest.");
        System.out.println("wealth: " + max);
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 3 }, { 7, 2 }, { 2, 8 } };
        richestCustomer(accounts);
    }
}