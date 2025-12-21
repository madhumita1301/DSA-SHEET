
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int nonSpecialCount(int l, int r) {
        


        // Function to generate primes up to `n` using Sieve of Eratosthenes
        boolean[] isPrime = new boolean[(int)Math.sqrt(r) + 1];
        for (int i = 2; i < isPrime.length; i++) isPrime[i] = true;

        for (int i = 2; i * i <= isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        Set<Integer> specialNumbers = new HashSet<>();
        
        // Add all p^2 where p is a prime and p^2 is within range [l, r]
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                int specialNumber = i * i;
                if (specialNumber >= l && specialNumber <= r) {
                    specialNumbers.add(specialNumber);
                }
            }
        }
        
        int totalCount = r - l + 1;
        int specialCount = specialNumbers.size();
        
        return totalCount - specialCount;
    }
}