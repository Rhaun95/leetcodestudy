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

class Merge_Nodes_in_Between_Zeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode currentNode = head.next;

        ListNode mergeRoot = new ListNode(0);
        ListNode mergedCurrent = mergeRoot;
        int sum = 0;

        while (currentNode != null) {  // Time Complexity O(n), n is the size of ListNode
            sum += currentNode.val;
            if (currentNode.val == 0) {
                ListNode node = new ListNode(sum);
                mergedCurrent.next = node;
                mergedCurrent = mergedCurrent.next;
                sum = 0;
            }
            currentNode = currentNode.next;
        }

        return mergeRoot.next;
    }
}
