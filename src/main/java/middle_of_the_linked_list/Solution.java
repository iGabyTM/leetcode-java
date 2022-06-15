package middle_of_the_linked_list;

import common.ListNode;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list">Problem</a>
 * <br>
 * <a href="https://leetcode.com/submissions/detail/723006646/">Submission</a>
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        var count = 1;
        var temp = head;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        final var center = (count % 2 == 0) ? count / 2 : (count - 1) / 2;
        var i = 0;

        while (i != center) {
            head = head.next;
            i++;
        }

        return head;
    }

}
