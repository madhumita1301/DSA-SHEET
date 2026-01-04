class Solution {
    public int sumFourDivisors(int[] nums) {
        int finalAns = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int count = 0;
            int sum = 0;

            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    int d1 = j;
                    int d2 = n / j;

                    count++;
                    sum += d1;

                    if (d1 != d2) {
                        count++;
                        sum += d2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                finalAns += sum;
            }
        }

        return finalAns;
    }
}
