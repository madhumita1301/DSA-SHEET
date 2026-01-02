class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0, ans2 = 0;
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int x : nums1) {
            if (set2.contains(x)) {
                ans1++;
            }
        }
        for (int x : nums2) {
            if (set1.contains(x)) {
                ans2++;
            }
        }
        return new int[] { ans1, ans2 };

    }
}