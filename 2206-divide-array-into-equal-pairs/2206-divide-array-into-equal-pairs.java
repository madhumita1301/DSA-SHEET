class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        if (n % 2 != 0)
            return false;
        int[] freq = new int[501];
        for (int num : nums) {
            freq[num]++;
        }
        for (int num : freq) {
            if (num % 2 != 0)
                return false;
        }
        return true;
    }
}