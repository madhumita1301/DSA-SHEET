class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            total += num;
        }
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                ans = i;
                break;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}
