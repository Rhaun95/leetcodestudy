class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int small = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (small > prices[i]) {
                small = prices[i];
            } else {
                max = Math.max(prices[i] - small, max);
            }
        }
        return max;
    }
    /**
     * n: number of prices

     T: O(n)
     comparison of every possible price pair : O(n*(n-1)/2) = O(n^2)

     S: O(1)
     max: O(1)
     small: O(1)

     */
}