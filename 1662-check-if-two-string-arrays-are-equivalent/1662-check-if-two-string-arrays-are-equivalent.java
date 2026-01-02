class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }
        int i = 0;
        int j = 0;
        if (str1.length() != str2.length())
            return false;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j))
                return false;
            i++;
            j++;
        }
        return true;
    }
}