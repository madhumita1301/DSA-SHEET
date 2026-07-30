class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        int len = ans.size();
        int res[] = new int[len];
        int idx = 0;
        for (int num : ans) {
            res[idx++] = num;
        }
        return res;
    }
}