class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[] = new int[nums.length];
        int idx_even = 0;
        int idx_odd = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[idx_even] = num;
                idx_even += 2;
            } else {
                ans[idx_odd] = num;
                idx_odd += 2;
            }
        }
        return ans;
    }
}