class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer for string 's'
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the pointer for string 't'
            j++;
        }
        
        // If 'i' reached the end of 's', we found all characters in order
        return i == s.length();
    }
}
