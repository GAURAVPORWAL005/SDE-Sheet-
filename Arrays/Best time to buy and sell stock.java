https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        int current = prices[0];
        for(int i=1;i<prices.length;i++){
            if(current > prices[i]){
                current = prices[i];
            }
            else{
                profit = prices[i] - current;
                max = Math.max(max,profit);
            }
        }
        return max;
    }
}
