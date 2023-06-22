class Solution {
    public int[] getAverages(int[] nums, int k) {
        
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);

        if (nums.length <= (k * 2)) {
            return res;
        }

        long sum = 0;
        long range = 2 * k + 1L;
   
        for (int i = 0; i <= 2 * k; ++i) {
            sum += nums[i];
        }
 

        res[k] = (int) (sum / range);
        for (int i = k + 1; i < nums.length - k; ++i) {
            sum = sum - nums[i - k - 1] + nums[i + k];
            res[i] = (int) (sum / range);
        }

        return res;
    }
}
