class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
            if (freq[num] >= 2)
                ans.add(num);
        }
        return ans;
    }
}