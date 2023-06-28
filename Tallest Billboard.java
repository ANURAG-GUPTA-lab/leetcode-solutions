class Solution {
    public int tallestBillboard(int[] rods) {
        int n = rods.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += rods[i];
        }
 
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 0;
 
        for (int i = 1; i <= n; i++) {
            int height = rods[i - 1];
            // Without the current height, the difference must be in [0, sum-height]
            for (int j = 0; j <= sum - height; j++) {
                if (dp[i - 1][j] < 0) {
                    continue;
                }
                // Not used
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                // Put on the taller one
                dp[i][j + height] = Math.max(dp[i][j + height], dp[i - 1][j]);
                // Put on the shorter one
                dp[i][Math.abs(j - height)] = Math.max(dp[i][Math.abs(j - height)], dp[i - 1][j] + Math.min(j, height));
            }
        }
        return dp[n][0]; 
    }
}
