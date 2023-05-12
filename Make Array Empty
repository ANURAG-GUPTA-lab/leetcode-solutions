class Solution {
  public long countOperationsToEmptyArray(int[] nums) {
    final int n = nums.length;
    long solution = n;
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < n; ++i)
      numToIndex.put(nums[i], i);

    Arrays.sort(nums);

    for (int i = 1; i < n; ++i) 
      if (numToIndex.get(nums[i]) < numToIndex.get(nums[i - 1]))
        solution += n - i;

    return solution;
  }
}
