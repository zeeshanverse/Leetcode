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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and last node
        int n = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // k can be greater than n
        k = k % n;

        if (k == 0) {
            return head;
        }

        // Make the list circular
        tail.next = head;

        // Find the new tail
        int steps = n - k;
        ListNode newTail = tail;

        while (steps > 0) {
            newTail = newTail.next;
            steps--;
        }

        // New head is after new tail
        ListNode newHead = newTail.next;

        // Break the circle
        newTail.next = null;

        return newHead;
    }
}