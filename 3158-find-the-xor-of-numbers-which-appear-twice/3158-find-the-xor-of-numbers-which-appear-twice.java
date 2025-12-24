class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] seen = new boolean[51]; 
        int xorr = 0;

        for (int n : nums) {
            if (seen[n]) {
                xorr ^= n;  
            } else {
                seen[n] = true;
            }
        }
        return xorr;
    }
}