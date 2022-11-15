
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int sell = prices[prices.length-1];
        for(int i= prices.length-2;i>=0;i--){
            profit = Integer.max(profit,sell-prices[i]);
            sell = Integer.max(sell, prices[i]);
        }
        return profit;
    }
}
