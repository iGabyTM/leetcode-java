package reverse_integer;

/**
 * <a href="https://leetcode.com/problems/reverse-integer/">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/723229146/">Submission</a>
 */
class Solution {

    public int reverse(int x) {
        var total = 0L;

        while (x != 0) {
            total = total * 10 + x % 10;
            x /= 10;
        }

        return (total < Integer.MIN_VALUE || total > Integer.MAX_VALUE) ? 0 : (int) total;
    }

}
