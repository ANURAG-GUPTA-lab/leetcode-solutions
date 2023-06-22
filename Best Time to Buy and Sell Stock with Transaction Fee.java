class Solution {
    public int maxProfit(int[] prices, int fee) {
        int notHold = 0, hold = -0x3f3f3f3f;

        for (int i = 0; i < prices.length; i++) {
            hold = Math.max(hold, notHold - prices[i]);
            notHold = Math.max(notHold, hold + prices[i] - fee);
        }
        return notHold;
    }
}
