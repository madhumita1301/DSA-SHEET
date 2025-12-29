class Solution {
    public int reverse(int x) {
        int dig = 0;
        int sum = 0;
        while (x != 0) {
            dig = x % 10;
            x /= 10;
            if (sum > Integer.MAX_VALUE / 10 || sum < Integer.MIN_VALUE / 10)
                return 0;
            sum = (sum * 10) + dig;
        }
        return sum;
    }
}