class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) {
            if (!(st.add(num)))
                return num;
        }
        return -1;
    }
}