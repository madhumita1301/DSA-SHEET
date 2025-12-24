class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else {
                if (majority == nums[i])
                    count++;
                else
                    count--;
            }
        }
        return majority;
    }
}