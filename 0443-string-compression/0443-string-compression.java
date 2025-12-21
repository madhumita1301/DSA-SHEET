class Solution {
    public int compress(char[] chars) {
        // Edge case
        if (chars.length == 0)
            return 0;
            
        int write = 0; // Position to write in the chars array
        int read = 0; // Position to read from the chars array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the number of times currentChar repeats
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                char[] countChars = Integer.toString(count).toCharArray();
                for (char c : countChars) {
                    chars[write++] = c;
                }
            }
        }
    
    return write;
}
}