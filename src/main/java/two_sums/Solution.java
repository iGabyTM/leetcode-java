package two_sums;

/**
 * <a href="https://leetcode.com/problems/two-sum">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/723013635/">Submission</a>
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {
        final var n = nums.length;

        for (var i = 0; i < n; i++) {
            for (var j = i + 1; j < n; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

}
