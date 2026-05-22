import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();

        backtrack(0, s, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start,
                           String s,
                           List<String> path,
                           List<List<String>> result) {

        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {

            String sub = s.substring(start, end);

            if (isPalindrome(sub)) {

                path.add(sub);

                backtrack(end, s, path, result);

                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
