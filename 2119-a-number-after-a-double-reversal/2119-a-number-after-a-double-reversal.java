class Solution {
    public boolean isSameAfterReversals(int num) {
        int og = num;
        int firstRev = reverse(num);
        int secondRev = reverse(firstRev);
        return og == secondRev;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        return rev;
    }
}