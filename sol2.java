//Given a string s, find the length of the longest substring without repeating characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = s.substring(i, j);
                if (hasRepeatingCharacters(substring)) {
                    break;
                }
                longestSubstring = Math.max(longestSubstring, substring.length());
            }
        }

        return longestSubstring;
    }

    private boolean hasRepeatingCharacters(String s) {
        int length = s.length();
        for (int i = 0; i < length - 1; i++) {
            char currentChar = s.charAt(i);
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(j) == currentChar) {
                    return true;
                }
            }
        }
        return false;
    }
}
