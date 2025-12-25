class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        long sum = 0;

        Arrays.sort(happiness);
        int dec = 0;
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            int val = happiness[i] - dec;
            if (val <= 0)
                break;
            sum += val;
            dec++;
            k--;
        }

        return sum;
    }
}
