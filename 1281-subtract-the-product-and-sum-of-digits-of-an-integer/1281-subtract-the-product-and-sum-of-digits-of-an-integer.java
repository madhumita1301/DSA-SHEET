class Solution {
    public int subtractProductAndSum(int n) {
        int og = n;
        int pr = 1;
        int sum = 0;
        int diff = 0;
        while (n != 0) {
            int dig = n % 10;
            pr *= dig;
            sum += dig;
            n /= 10;
        }
        diff = pr - sum;
        return diff;
    }
}