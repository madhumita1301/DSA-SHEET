class Solution {
    public int[] twoSum(int[] nums, int target) {
        // BRUTE FORCE METHOD 
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target)
        // return new int[] { i, j };
        // }
        // }
        // return new int[0];
        // }

        // Using HASHMAP 
        int n = nums.length;
        int[] ans = { -1 }; // initialized value of the array
        // makking a HashMap of values of the array and their indices
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - nums[i];
            if (mp.containsKey(partner)) { // if the map contains the other value needed to hit the target
                ans = new int[] { (mp.get(partner)), i };
                return ans;
            } else { // if the partner for target is not found then we keep putting the values and
                     // their indices
                mp.put(nums[i], i);
            }
        }
        return ans;
    }
}