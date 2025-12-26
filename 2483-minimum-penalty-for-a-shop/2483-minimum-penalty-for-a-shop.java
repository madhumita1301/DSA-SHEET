class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;
        for (char c : customers.toCharArray()) {
            if (c == 'Y')
                penalty++;
        }

        int minPenalty = penalty;
        int bestHour = 0;
        for (int j = 1; j <= customers.length(); j++) {
            char prev = customers.charAt(j - 1);

            if (prev == 'N')
                penalty++;
            else
                penalty--;

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = j;
            }
        }

        return bestHour;
    }
}
