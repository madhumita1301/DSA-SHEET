class Solution {
     static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {// if the key is not present in the map then insert it with frequency 1
                mp.put(ch, 1);
            } else { // key is already present then update/ increase its frequency by 1
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1); 
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2); 
    }
}