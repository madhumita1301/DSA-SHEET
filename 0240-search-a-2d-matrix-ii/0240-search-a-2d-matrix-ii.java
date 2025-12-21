class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int n = a.length;
        int m = a[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (target == a[i][j]) {
                return true;
            }
            if (target < a[i][j]) {
                j--; // move left
            } else {
                i++; // move down
            }
        }
        return false;
    }
}