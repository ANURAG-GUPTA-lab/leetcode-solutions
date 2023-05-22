class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();        
        // Count the frequency of each element
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }        
        // Create a priority queue (min heap) based on the frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );        
        // Add elements to the heap
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }        
        // Extract elements from the heap
        int[] result = new int[k];
        int index = 0;
        while (!heap.isEmpty()) {
            result[index++] = heap.poll().getKey();
        }        
        // Reverse the result array
        reverseArray(result);
        
        return result;
    }
    
    // Helper method to reverse an array
    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
    }
}
}
