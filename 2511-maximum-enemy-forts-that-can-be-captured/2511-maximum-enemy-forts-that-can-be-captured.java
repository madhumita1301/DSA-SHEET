class Solution {
    public int captureForts(int[] forts) {
        int last = -1;
        int ans = 0;

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (last != -1 && forts[i] != forts[last]) {
                    ans = Math.max(ans, i - last - 1);
                }
                last = i;
            }
        }
        return ans;
    }
}
