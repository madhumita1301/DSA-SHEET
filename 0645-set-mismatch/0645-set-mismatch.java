class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        int total = n * (n + 1) / 2; //sum of n natural nos
        HashSet<Integer> st = new HashSet<>();
        int sum = 0;
        int dupe = 0;
        for (int num : nums) {
            if (st.contains(num))
                dupe = num;
            st.add(num);
        }
        for (int num : st) {
            sum += num;
        }
        int missingNum = total - sum;
        ans[0] = dupe;
        ans[1] = missingNum;
        return ans;

    }
}