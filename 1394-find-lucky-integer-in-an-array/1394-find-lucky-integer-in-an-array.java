class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        int freq[] = new int[501];
        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == freq[arr[i]]) {
                res = Math.max(res, arr[i]);
            }
        }
        return res;
    }
}