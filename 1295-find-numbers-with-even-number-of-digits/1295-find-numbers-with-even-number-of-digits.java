class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int num : nums) {
            int ans = 0;
            while (num != 0) {
                int dig = num % 10;
                ans++;
                num = num / 10;
            }
            if (ans % 2 == 0)
                even++;
        }
        return even;
    }
}