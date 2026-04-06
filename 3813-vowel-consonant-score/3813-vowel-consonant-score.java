class Solution {
    public int vowelConsonantScore(String s) {
        int c = 0, v = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {  
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        if (c == 0) return 0;  
        return v / c;
    }
}