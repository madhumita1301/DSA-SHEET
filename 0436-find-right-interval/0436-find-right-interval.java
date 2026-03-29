class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] startArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            startArr[i][0] = intervals[i][0];
            startArr[i][1] = i;
        }
        Arrays.sort(startArr, (a, b) -> a[0] - b[0]);
        
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int idx = binarySearch(startArr, end);
            if (idx == -1) res[i] = -1;
            else res[i] = startArr[idx][1];
        }
        
        return res;
    }
    
    private int binarySearch(int[][] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid][0] >= target) {
                ans = mid;
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}