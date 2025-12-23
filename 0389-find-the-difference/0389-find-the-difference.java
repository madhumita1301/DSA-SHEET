class Solution {
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            cnt[idx]--;
            if (cnt[idx] < 0) {
                return t.charAt(i);
            }
        }
        return ' '; 
    }
}
