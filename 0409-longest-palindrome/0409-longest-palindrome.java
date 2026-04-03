class Solution {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray()) {
            cnt[c]++;
        }

        int length = 0;
        boolean hasOdd = false;
        for (int c : cnt) {
            if (c % 2 == 0) {
                length += c;
            } else {
                length += c - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) length++;
        return length;
    }
}