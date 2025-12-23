class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int cnt[] = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[nums[i]]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 1)
                return i;
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
