
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

// In binary, powers of two have exactly one bit set to 1.
// 100 & 011 = 000, or 4 & 3 = 0
// If n is a power of two, its binary representation has only one 1 bit,
//  and n - 1 has all the bits flipped after the rightmost 1.