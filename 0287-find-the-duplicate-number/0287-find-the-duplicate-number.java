class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int cnt[] = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[nums[i]]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= 2)
                return i;
        }
        return -1;
    }
}