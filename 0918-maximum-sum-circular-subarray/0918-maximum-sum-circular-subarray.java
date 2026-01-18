class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int curMax = 0, maxSum = nums[0];
        int curMin = 0, minSum = nums[0];

        for (int n : nums) {
            totalSum += n;

            curMax = Math.max(n, curMax + n);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(n, curMin + n);
            minSum = Math.min(minSum, curMin);
        }

        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
