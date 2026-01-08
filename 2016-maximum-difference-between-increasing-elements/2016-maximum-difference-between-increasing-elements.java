class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min=Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            min=Math.min(min,nums[i]);
            if (nums[i] < nums[i + 1]) {
                ans = Math.max(ans, nums[i+1] - min);
            }
        }
        return ans;
    }
}