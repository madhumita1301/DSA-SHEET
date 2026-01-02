class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int lateStreak = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                absent++;
                if (absent >= 2) return false;
                lateStreak = 0;
            } 
            else if (ch == 'L') {
                lateStreak++;
                if (lateStreak >= 3) return false;
            } 
            else { // 'P'
                lateStreak = 0;
            }
        }
        return true;
    }
}
