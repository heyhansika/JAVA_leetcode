class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String p1 = expandAroundCenter(s, i, i);
            // Even length palindrome
            String p2 = expandAroundCenter(s, i, i + 1);

            if (p1.length() > result.length()) {
                result = p1;
            }
            if (p2.length() > result.length()) {
                result = p2;
            }
        }

        return result;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && 
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
