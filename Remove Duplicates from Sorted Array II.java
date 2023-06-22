class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int next = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || i == 1) nums[next++] = nums[i];
            else{
                if(nums[i] != nums[next - 1] || nums[i] != nums[next - 2])
                    nums[next++] = nums[i];
            }
        }
        return next;
    }
}
