package fizz_buzz;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz/">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/722825788/">Submission</a>
 */
public class Solution {

    public List<String> fizzBuzz(int n) {
        final var answer = new ArrayList<String>(n);

        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }

        return answer;
    }

}
