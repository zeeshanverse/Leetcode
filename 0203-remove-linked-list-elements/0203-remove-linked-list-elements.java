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
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         if(head == null ) return head ;
//         if(head.val == val ) {
//             ListNode temp = head ;
//             head = head.next ;
//             return head ;
//         }
//         ListNode temp = head ;
//         ListNode prev = null ;
//         while(temp != null ) {
//             // prev = temp ;
//             if(temp.val == val ) {
//                 prev.next = prev.next.next ;
//                 break ;
//             }
//             prev = temp ;
//             temp = temp.next ;
//         }
//         return head ;
//     }
// }
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}