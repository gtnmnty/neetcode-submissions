class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxTP = 0;

        for(int shortt : prices){
            maxTP = Math.max(maxTP, shortt - minBuy);
            minBuy = Math.min(minBuy, shortt);
        }
        return maxTP;
    }
}
