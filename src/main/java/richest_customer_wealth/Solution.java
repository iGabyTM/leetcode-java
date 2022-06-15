package richest_customer_wealth;

/**
 * <a href="https://leetcode.com/problems/richest-customer-wealth/">Problem</a>
 */
public class Solution {

    public int maximumWealth(int[][] accounts) {
        var richest = 0;

        for (final var account : accounts) {
            var temp = 0;

            for (final var i : account) {
                temp += i;
            }

            richest = Math.max(richest, temp);
        }

        return richest;
    }

}
