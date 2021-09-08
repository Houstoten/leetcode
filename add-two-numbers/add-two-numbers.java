/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.Optional;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersWithRemain(l1, l2, 0);
    }

    static ListNode addTwoNumbersWithRemain(ListNode l1, ListNode l2, int remain) {

        if(l1 == null && l2 == null && remain == 0) {
            return null;
        }

        ListNode safeL1 = (Optional.ofNullable(l1).isEmpty() ? new ListNode(0) : l1);
        ListNode safeL2 = (Optional.ofNullable(l2).isEmpty() ? new ListNode(0) : l2);

        int res = safeL1.val + safeL2.val + remain;
        int newRemain = 0;

        if (res >= 10) {
            newRemain = res / 10;
            res %= 10;
        }

        return new ListNode(res, addTwoNumbersWithRemain(safeL1.next, safeL2.next, newRemain));
    }

}