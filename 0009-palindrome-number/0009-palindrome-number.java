class Solution {
    int rem;
    int sum = 0;

    public boolean isPalindrome(int x) {
        int temp=x;
        if(x<0) return false; //negative no.
        while (x != 0) {
            rem = x % 10;
            sum = sum * 10 + rem;
            x /= 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }
}