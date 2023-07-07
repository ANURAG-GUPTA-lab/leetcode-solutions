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
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {

            return;

        }

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

        }

        ListNode head2 = reverse(slow.next);

        slow.next = null;

        while (head != null && head2 != null) {

            ListNode next1 = head.next;

            ListNode next2 = head2.next;

            head.next = head2;

            head2.next = next1;

            head = next1;

            head2 = next2;

        }

    }

    private ListNode reverse(ListNode node) {

        ListNode prev = null;

        while (node != null) {

            ListNode next = node.next;

            node.next = prev;

            prev = node;

            node = next;

        }

        return prev;
    }
}
