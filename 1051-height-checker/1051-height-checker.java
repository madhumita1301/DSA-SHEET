class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = new int[heights.length];
        int idx = 0;
        int k = 0;
        for (int num : heights) {
            expected[idx++] = num;
        }
        Arrays.sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                k++;
        }
        return k;
    }
}