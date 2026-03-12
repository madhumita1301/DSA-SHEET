class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                nums[i] = 2 * original;
                original = nums[i];
            }
        }
        return original;
    }
}