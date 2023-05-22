/*public class ListNode {
    int val;
    ListNode next;
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/
 
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Count the number of nodes in the list
        int count = 0;
        ListNode curr = head;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // If the number of nodes is less than k, return the head
        if (count < k) {
            return head;
        }

        // Reverse the next group recursively
        ListNode newHead = reverseKGroup(curr, k);

        // Reverse the current group of k nodes
        ListNode prev = null;
        curr = head;
        for (int i = 0; i < k; i++) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Connect the reversed group with the next group
        head.next = newHead;

        // Return the new head of the reversed group
        return prev;
    }
}
