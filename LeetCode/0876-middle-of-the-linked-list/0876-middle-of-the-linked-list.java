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
    public ListNode middleNode(ListNode head) {

        ListNode[] temp = new ListNode[100];
        int NodeSize = 0;

        while (head != null) {
            temp[NodeSize] = head;
            head = head.next;
            NodeSize ++;
        }
        return temp[NodeSize/2];
    }
}