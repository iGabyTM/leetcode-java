package container_with_most_water;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/723711373/">Submission</a>
 */
class Solution {

    public int maxArea(int[] height) {
        final var length = height.length;

        if (length <= 1) {
            return 0;
        }

        var left = 0;
        var right = length - 1;
        var max = 0;

        while (left < right) {
            final var l = height[left];
            final var r = height[right];

            max = Math.max(max, Math.min(l, r) * (right - left));

            if (l > r) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }

}
