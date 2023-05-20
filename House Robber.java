class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        for(int i = 1; i <= n; i++){
            dp[i] = Math.max(dp[i - 1], (i > 1 ? dp[i - 2]: 0) + nums[i - 1]);
        }
        return dp[n];
    }
}
