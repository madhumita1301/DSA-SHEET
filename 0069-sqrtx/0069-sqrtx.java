class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        
        int st = 1, end = x;
        int ans = 0;
        
        while (st < end) {
            int mid = st + (end - st) / 2;
            long val = (long) mid * mid; // prevent overflow
            
            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        
        return ans;
    }
}

