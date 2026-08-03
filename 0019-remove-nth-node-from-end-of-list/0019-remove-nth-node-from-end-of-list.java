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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null ;

        ListNode temp = head ;
        int count = 0 ;

        while(temp != null ) {
            count++ ;
            temp = temp.next ;
        }
        if(count == n ) {
            ListNode newHead = head.next ;

            return newHead ;
        }

        int res = count - n ;
        temp = head ;

        while(temp != null ) {
            res-- ;
            if(res == 0 ) break ;
            temp = temp.next ;

        }

        ListNode del = temp.next ;
        temp.next = temp.next.next ;

        return head ;

        // if(head == null ) return null ;

        // ListNode fast = head ;
        // for(int i = 1 ; i <= n ; i++ ) fast = fast.next ;

        // if(fast == null ) return head.next ;

        // ListNode slow = head ;

        // while(fast.next != null ) {
        //     slow = slow.next ;
        //     fast = fast.next ;
        // }
        
        // ListNode del = slow.next ;
        // slow.next = slow.next.next ;

        // return head ;   

    }
}