class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        Arrays.sort(nums);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}