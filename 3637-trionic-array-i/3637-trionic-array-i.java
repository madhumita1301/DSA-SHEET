class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int p = 0;
        while (p + 1 < n && nums[p] < nums[p + 1]) p++;
        if (p == 0) return false;

        int q = p;
        while (q + 1 < n && nums[q] > nums[q + 1]) q++;
        if (q == p || q == n - 1) return false;

        while (q + 1 < n && nums[q] < nums[q + 1]) q++;

        return q == n - 1;
    }
}
