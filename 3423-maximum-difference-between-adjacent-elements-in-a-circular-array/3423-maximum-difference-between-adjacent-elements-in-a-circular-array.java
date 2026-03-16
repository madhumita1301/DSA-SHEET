class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = Math.abs(nums[0] - nums[nums.length - 1]);
        for (int i = 1; i < nums.length; i++) {
            diff = Math.max(diff, Math.abs(nums[i] - nums[i - 1]));
        }
        return diff;
    }
}