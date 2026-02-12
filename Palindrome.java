class Solution {
    public boolean isPalindrome(int x) {

        // Step 1: Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        // Step 2: Reverse the number
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        // Step 3: Compare
        return original == reverse;
    }
}
