class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //     // Ensure a is the smaller array
        //     if (a.length > b.length)
        //         return findMedianSortedArrays(b, a);

        //     int n = a.length;
        //     int m = b.length;

        //     int low = 0, high = n;

        //     while (low <= high) {
        //         int mid1 = (low + high) / 2;
        //         int mid2 = (n + m + 1) / 2 - mid1;

        //         int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
        //         int r1 = (mid1 == n) ? Integer.MAX_VALUE : a[mid1];

        //         int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];
        //         int r2 = (mid2 == m) ? Integer.MAX_VALUE : b[mid2];

        //         if (l1 <= r2 && l2 <= r1) {
        //             if ((n + m) % 2 == 0)
        //                 return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
        //             else
        //                 return Math.max(l1, l2);
        //         } 
        //         else if (l1 > r2) {
        //             high = mid1 - 1;
        //         } 
        //         else {
        //             low = mid1 + 1;
        //         }
        //     }
        //     return 0.0;
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
