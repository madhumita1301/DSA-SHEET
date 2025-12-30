class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // int neg = 0;
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (grid[i][j] < 0)
        //             neg++;
        //     }
        // }
        // return neg;
        int i = m - 1;
        int j = 0;
        int res = 0;
        // STAIRCASE METHOD
        while (i >= 0 && j < n) {
            if (grid[i][j] < 0) {
                res += n - j;
                i--;
            } else {
                j++;
            }
        }
        return res;
    }
}