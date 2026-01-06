class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if(l>r){
                ans[idx--]=l;
                left++;
            }
            else{
                ans[idx--]=r;
                right--;

            }
        }
        return ans;
    }
}