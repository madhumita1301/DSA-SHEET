class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        int merged[] = new int[n + m];
        int k = 0;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }
        while (i < n)
            merged[k++] = nums1[i++];
        while (j < m)
            merged[k++] = nums2[j++];
        int len = merged.length;
        double median =0.0;
        if (len % 2 != 0) {
            median= merged[len / 2];
        } else {
            median= (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
        }
        return median;
    }
}
