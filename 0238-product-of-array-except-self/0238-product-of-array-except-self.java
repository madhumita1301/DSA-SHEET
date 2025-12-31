class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int n = nums.length;
        int prod = 1;
        int left = 1;
        int right = 1;
        int pref[] = new int[nums.length];
        int suff[] = new int[nums.length];
        for (int i = 0; i < n; i++) {
            pref[i] = left;
            left *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            suff[i] = right;
            right *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = pref[i] * suff[i];
        }
        return res;
    }
}