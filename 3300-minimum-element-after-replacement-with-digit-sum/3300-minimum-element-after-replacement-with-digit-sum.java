class Solution {
    public int minElement(int[] nums) {
        int ans = 99999;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int dig = 0;
            int og = nums[i];
            while (og != 0) {
                dig = og % 10;
                sum += dig;
                og /= 10;
            }
            if (sum < ans)
                ans = sum;
        }
        return ans;
    }
}