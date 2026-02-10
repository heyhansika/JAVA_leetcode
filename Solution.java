class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String prefix = strs[0];

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {
                // If index out of bounds OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }
}
