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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode newTemp = dummyHead;
        ListNode temp = head.next;
        int sum = 0;

        if (head == null && head.next == null) return head;

        while (temp != null) {  // Time Complexity O(n), n is the size of ListNode
            sum += temp.val;  
            if (temp.val == 0) {
                ListNode node = new ListNode(sum);
                newTemp.next = node;
                newTemp = newTemp.next; 
                sum = 0;
            }
            temp = temp.next;
        }

        return dummyHead.next; 
    }
}
