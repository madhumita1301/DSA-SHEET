class Solution {
    public int buyChoco(int[] prices, int money) {
        // Sort the prices array to use two-pointer approach and ensure we minimize the
        // cost of the two chocolates that we buy
        Arrays.sort(prices);

        // Calculate the sum of the two cheapest chocolates to minimize the cost of the two chocolates that we buy
        int totalPrice = prices[0] + prices[1];

        // Check if we can buy two chocolates without exceeding the available money
        if (totalPrice > money) {
            return money; // Cannot buy chocolates, so return the original money
        }

        // Return the remaining money after buying the two chocolates
        return money - totalPrice;
    }
}
