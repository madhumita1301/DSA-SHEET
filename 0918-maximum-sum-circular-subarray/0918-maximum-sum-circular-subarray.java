class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0; 
        int maxSumWithoutWrap = Integer.MIN_VALUE; 
        int currentMax = 0; 
        int minSumWithWrap = Integer.MAX_VALUE; 
        int currentMin = 0;
        
        for (int num : nums) {
            totalSum += num;
            
            currentMax = Math.max(currentMax + num, num);
            maxSumWithoutWrap = Math.max(maxSumWithoutWrap, currentMax);
           
            currentMin = Math.min(currentMin + num, num);
            minSumWithWrap = Math.min(minSumWithWrap, currentMin);
        }
    
        if (maxSumWithoutWrap < 0) {
            return maxSumWithoutWrap;
        }
        
        return Math.max(maxSumWithoutWrap, totalSum - minSumWithWrap);
    }
}