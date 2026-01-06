class Solution {
    public int fib(int n) {
        // int ans = 0;
        // if (n == 1)
        //     return 1;
        // if (n > 1) {
        //     ans += fib(n - 2) + fib(n - 1);
        // }
        // return ans;
        int a = 0;
        int b = 1;
        int c = 0;
        if (n == 1)
            return 1;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}