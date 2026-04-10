class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            boolean left = (i - k < 0) || nums[i] > nums[i - k];
            boolean right = (i + k >= n) || nums[i] > nums[i + k];

            if (left && right) {
                sum += nums[i];
            }
        }

        return sum;
    }
}