// In this question we have given an integer array prices every value of array defines
// the value of stock for that day,
// we have to find a day on which the buying price is low and after it one day when
// selling price is high so that we can have the maximum profit
// and we have to return the value of maximum profit
// for eg: {7, 1, 5, 3, 6, 4} in this array if we take 1 as buying price and
// 6 as selling price then according to these values
// profit = selling price - buying price
// 6 - 1 = 5 we have the maximum profit

// time complexity here: O(n)
// space complexity here: O(1)

public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyOrSellStock(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        // maximum possible value for a 32 bit signed integer ( 2,147,483,647 or 2³¹-1)
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                // profit = selling price - buying price
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bestTimeToBuyOrSellStock(prices));
    }
}
