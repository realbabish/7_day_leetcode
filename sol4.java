/* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned). */

class Solution {
    public int reverse(int x) {
        final int INT_MIN = -2147483648;
        final int INT_MAX = 2147483647;

        int sign = 1;
        int revValue = 0;
        int buff = 0;

        if (x < 0) {
            sign = -1;
            x = Math.abs(x);
        }

        while (x != 0) {
            buff = x % 10;
            // Check for integer overflow
            if (revValue > (INT_MAX - buff) / 10) {
                return 0;
            }
            revValue = revValue * 10 + buff;
            x = x / 10;
        }

        return revValue * sign;
    }
}
