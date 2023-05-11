class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        int[] merge = new int[m + n];
        int count = 0;
        while(i < m || j < n){
            if(i < m && j < n)
                merge[count++] = nums1[i] <= nums2[j] ? nums1[i++]: nums2[j++];
            else if(i < m)
                merge[count++] = nums1[i++];
            else
                merge[count++] = nums2[j++];
        }
        return (m + n) % 2 != 0 ?
            (double)merge[(m + n) / 2] :
        ((double)merge[(m+n) / 2] + (double)merge[(m+n) / 2 - 1]) / 2;
    }
}
