class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
        int idx = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                ans[idx++] = num;
        }
        for (int num : nums) {
            if (num % 2 != 0)
                ans[idx++] = num;
        }
        return ans;
    }
}