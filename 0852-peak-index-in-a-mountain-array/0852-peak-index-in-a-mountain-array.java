class Solution {
    public int peakIndexInMountainArray(int[] a) {
         int n = a.length;
        int st = 0;
        int end = n - 1;
        int ans=-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (a[mid] < a[mid + 1]) {
                ans = mid + 1;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}