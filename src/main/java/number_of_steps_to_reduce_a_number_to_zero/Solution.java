package number_of_steps_to_reduce_a_number_to_zero;

/**
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/722984601/">Submission</a>
 */
public class Solution {

    public int numberOfSteps(int num) {
        var steps = 0;

        while (num > 0) {
            if (num % 2 == 1) { // num is odd
                num -= 1;
            } else {
                num /= 2;
            }

            steps++;
        }

        return steps;
    }

}
