class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        String str = s.toLowerCase();
        StringBuilder og = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                og.append(ch);
            }
        }
        int i = 0;
        int j = og.length() - 1;
        while (i <= j) {
            if (og.charAt(i) != og.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;

    }
}