class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;
        int prevDiff = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff == 0) continue;
            if (prevDiff > 0 && diff < 0) ans++;
            if (prevDiff < 0 && diff > 0) ans++;
            prevDiff = diff;
        }
        return ans;
    }
}
