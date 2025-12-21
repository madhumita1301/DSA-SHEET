import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // quick check to ensure same length
        }
        
        HashMap<Character, Character> mp = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            
            if (mp.containsKey(sCh)) {
                // If the current character in s is already mapped, check if it maps to the correct tCh
                if (mp.get(sCh) != tCh) {
                    return false;
                }
            } else {
                // If sCh is not yet mapped, check if tCh is already mapped to some character in s
                if (mp.containsValue(tCh)) {
                    return false; // tCh is already mapped to a different sCh
                }
                mp.put(sCh, tCh); // map sCh to tCh
            }
        }
        
        return true;
    }
}
