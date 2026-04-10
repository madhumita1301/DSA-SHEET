class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int ans = 9;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                if (freq[i] < minFreq || (freq[i] == minFreq && i < ans)) {
                    minFreq = freq[i];
                    ans = i;
                }
            }
        }
        return ans;
    }
}