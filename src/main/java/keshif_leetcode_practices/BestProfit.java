package keshif_leetcode_practices;

public class BestProfit {
    public static void main(String[] args) {
        int[] prices = {7,2,6,1,5,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){

        int profit = 0;   // prices[right] - prices[left]
        int left = 0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[left] < prices[right]){
                profit = Math.max(profit, prices[right] - prices[left] );
            }else{
                left = right;
            }
        }
        return profit;
    }
}

   //    7,   1,   5,   3,   6,   4