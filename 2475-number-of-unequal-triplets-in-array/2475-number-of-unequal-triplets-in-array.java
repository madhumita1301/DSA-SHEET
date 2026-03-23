class Solution {
    public int unequalTriplets(int[] nums) {
        int[] freq = new int[1001];
        for (int num : nums) {
            freq[num]++;
        }
        int ans = 0;
        int left = 0;
        for (int i = 0; i <= 1000; i++) {
            if (freq[i] == 0)
                continue;
            int count = freq[i];
            int right = nums.length - left - count;
            ans += left * count * right;
            left += count;
        }
        return ans;
    }
}