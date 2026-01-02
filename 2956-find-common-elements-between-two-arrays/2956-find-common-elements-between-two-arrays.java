class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0, ans2 = 0;
        int n = nums1.length;
        int m = nums2.length;
        int freq1[] = new int[101];
        int freq2[] = new int[101];

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            freq1[num]++;
            set1.add(num);
        }
        for (int num : nums2) {
            freq2[num]++;
            set2.add(num);
        }
        for (int x : set1) {
            if (set2.contains(x)) {
                ans1 += freq1[x];
            }
        }
        for (int x : set2) {
            if (set1.contains(x)) {
                ans2 += freq2[x];
            }
        }
        return new int[] { ans1, ans2 };

    }
}