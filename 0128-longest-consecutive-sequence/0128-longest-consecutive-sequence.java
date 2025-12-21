class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums)
            st.add(num);
        int maxStreak = 0;
        for (int num : st) {
            if (!st.contains(num - 1)) { // num is the starting point of a sequence
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(currStreak, maxStreak);
            }
        }
        return maxStreak;
    }
}