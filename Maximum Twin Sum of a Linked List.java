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
    public int pairSum(ListNode head) {
        List<Integer> n = new ArrayList<>();
        while(head != null){
            n.add(head.val);
            head = head.next;
        }
        int ans =0;
        for(int i=0; i<n.size(); i++){
            ans = Math.max(ans, n.get(i) + n.get(n.size()-1-i));
        }
        return ans;
    }
}
