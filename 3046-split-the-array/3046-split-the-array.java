class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        // boolean ans = true;
        int n = nums.length;
        int freq[] = new int[101];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
            if (freq[nums[i]] > 2)
                return false;
        }
        return true;
    }
}