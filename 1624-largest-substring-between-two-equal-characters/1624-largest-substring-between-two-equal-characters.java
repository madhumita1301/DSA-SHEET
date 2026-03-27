class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] first = new int[26];
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }
        int maxLen = -1;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (first[idx] == -1) {
                first[idx] = i;
            } else {
                int len = i - first[idx] - 1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}