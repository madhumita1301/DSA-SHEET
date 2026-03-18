class Solution {
    public int kthFactor(int n, int k) {
        int ans[] = new int[n];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans[idx++] = i;
            }
        }
        if (idx < k)
            return -1;
        else
            return ans[k - 1];
    }
}