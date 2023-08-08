/**Given a string s, return the longest
 palindromic

 substring
 in s. */

class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        int maxLength = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = s.substring(i, j);
                int left = 0;
                int right = substring.length() - 1;
                boolean isPalindrome = true;
                while (left < right) {
                    if (substring.charAt(left) != substring.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalindrome && substring.length() > maxLength) {
                    longestPalindrome = substring;
                    maxLength = substring.length();
                }
            }
        }

        return longestPalindrome;
    }
}
