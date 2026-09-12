class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = { -1, -1 };
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (mp.containsKey(required)) {
                ans = new int[] { i, mp.get(required) };
                return ans;
            } else {
                mp.put(nums[i], i);
            }
        }
        return ans;
    }
}