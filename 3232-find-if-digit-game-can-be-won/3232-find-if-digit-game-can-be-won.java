public class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        int totalSum = 0;
        
        // Calculate the sums
        for (int num : nums) {
            totalSum += num;
            if (num >= 1 && num <= 9) {
                singleDigitSum += num;
            } else if (num >= 10 && num <= 99) {
                doubleDigitSum += num;
            }
        }
        
        // Check if Alice can win
        int bobSumIfAliceChoosesSingleDigit = totalSum - singleDigitSum;
        int bobSumIfAliceChoosesDoubleDigit = totalSum - doubleDigitSum;
        
        boolean aliceWinsWithSingleDigit = singleDigitSum > bobSumIfAliceChoosesSingleDigit;
        boolean aliceWinsWithDoubleDigit = doubleDigitSum > bobSumIfAliceChoosesDoubleDigit;
        
        return aliceWinsWithSingleDigit || aliceWinsWithDoubleDigit;
    }}

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] nums = {3, 12, 5, 30, 7}; // Example input
//         System.out.println(solution.canAliceWin(nums)); // Output: true or false based on the input
//     }
// }
