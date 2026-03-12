class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > ans) {
                ans = nums[i];
                idx = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == idx)
                continue;
            if (nums[i] * 2 > ans)
                return -1;
        }
        return idx;
    }
}