package running_sum_of_1d_array;

/**
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/724367579/">Submission</a>
 */
class Solution {

    public int[] runningSum(int[] nums) {
        final var length = nums.length;

        if (length <= 1) {
            return nums;
        }

        final var result = new int[length];
        var sum = 0;

        for (var i = 0; i < length; i++) {
            result[i] = (sum += nums[i]);
        }

        return result;
    }

}
