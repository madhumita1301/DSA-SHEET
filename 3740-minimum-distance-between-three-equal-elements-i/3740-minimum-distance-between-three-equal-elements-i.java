class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = 99999;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            int dist = 0;
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        dist += (j - i) + (k - j) + (k - i);
                        ans = Math.min(ans, dist);
                        check = true;
                    }
                }
            }
        }
        if (check)
            return ans;
        return -1;
    }
}