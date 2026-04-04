class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = { -1, -1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int required = target - nums[i];
            if (map.containsKey(required)) {
                ans = new int[] { (map.get(required)), i };
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}