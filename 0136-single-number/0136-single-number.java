class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int v : nums) {
            ans ^= v;
        }
        return ans;
    }
}
// ans ^= 2 (0 ^ 2 = 2)
// ans ^= 3 (2 ^ 3 = 1)
// ans ^= 2 (1 ^ 2 = 3)
// ans ^= 4 (3 ^ 4 = 7)
// ans ^= 3 (7 ^ 3 = 4)