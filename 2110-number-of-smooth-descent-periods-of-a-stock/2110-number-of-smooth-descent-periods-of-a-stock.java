class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long ans = n;
        long count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] - prices[i + 1] == 1) {
                count++;
            } else {
                count = 1;
            }
            ans += (count - 1);
        }
        return ans;
    }
}