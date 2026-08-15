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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head ;
        ListNode nextNode ;
        ListNode prevNode = null ;

        while(temp != null ) {
            ListNode kNode = findKNode(temp , k ) ;
            if(kNode == null ) {
                if(prevNode != null ) prevNode.next = temp ;
                break ;
            }
            nextNode = kNode.next ;
            kNode.next = null ;

            reverse(temp) ;

            if(temp == head ) head = kNode ;
            else prevNode.next = kNode ;

            prevNode = temp ;
            temp = nextNode ;
        }
        return head ;
    }

    ListNode findKNode(ListNode head , int size ) {
        ListNode temp = head ;
        int count = 0 ;

        while(temp != null ) {
            count++ ;
            if(count == size ) return temp ;
            temp = temp.next ;
        }
        return null ;
        // ListNode temp = head ;
        // k -= 1 ;
        // while(temp != null && k > 0 ) {
        //     k-- ;
        //     temp = temp.next ;
        // }
        // return temp ;
    }

    ListNode reverse(ListNode head ) {
        ListNode temp = head ;
        ListNode prev = null ;

        while(temp != null ) {
            ListNode front = temp.next ;
            temp.next = prev ;
            prev = temp ;
            temp = front ;
        }
        return prev ;
    }
}