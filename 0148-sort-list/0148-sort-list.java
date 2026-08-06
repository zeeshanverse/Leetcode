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
    public ListNode sortList(ListNode head) {

    //     if(head == null || head.next == null ) return null ;

    //     int count = 0 ;
    //     ListNode temp = head ;

    //     while(temp != null ) {
    //         count++ ;
    //         temp = temp.next ;
    //     }
    //     int [] nums = convert(head , count ) ; 
    //     Arrays.sort(nums) ;
    //     int i = 0 ;
    //     temp = head ;

    //     while(temp != null ) {
    //         temp.val = nums[i] ;
    //         temp = temp.next ;
    //         i++ ;
    //     }
    //     return head ;
    // }
    // int [] convert (ListNode head , int n ) {

    //     int [] arr = new int[n] ;
    //     ListNode temp = head ;

    //     int i = 0 ;
    //     while(temp != null ) {
    //         arr[i] = temp.val ;
    //         temp = temp.next ;
    //         i++ ;
    //     }
    //     return arr ;
    // }

        if(head == null || head.next == null ) return head ;
        
        ListNode mid = findMid(head) ;
        ListNode lefthead = head ;
        ListNode righthead = mid.next ;
        mid.next = null ;

        lefthead = sortList(lefthead) ;
        righthead = sortList(righthead) ;

        return mergeList(lefthead , righthead ) ;
    }

    ListNode findMid(ListNode head ) {
        ListNode slow = head ;
        ListNode fast = head.next ;

        while(fast != null && fast.next != null ) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }

    ListNode mergeList(ListNode list1 , ListNode list2 ) {
        ListNode dummy = new ListNode(-1) ;
        ListNode temp = dummy ;

        while(list1 != null && list2 != null ) {
            if(list1.val < list2.val ) {
                temp.next = list1 ;
                temp = list1 ;
                list1 = list1.next ;
            }else{
                temp.next = list2 ;
                temp = list2 ;
                list2 = list2.next ;
            }
        }
        if(list1 != null ) temp.next = list1 ;
        else temp.next = list2 ;

        return dummy.next ;
    }
}

