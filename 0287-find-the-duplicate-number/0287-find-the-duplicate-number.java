class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int cnt[] = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1)
                return nums[i];
        }
        return -1;
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {
//         int n = nums.length;
//         int[] cnt = new int[n + 1];

//         for (int num : nums) {
//             cnt[num]++;
//             if (cnt[num] > 1) {
//                 return num;
//             }
//         }
//         return -1;
//     }
// }
