class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten = 0;
        int five = 0;
        for (int price : bills) {
            if (price == 5) {
                five++;
            }
            if (price == 10) {
                ten++;
                five--;
            }
            if (price == 20) {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0)
                return false;
        }
        return true;
    }
}