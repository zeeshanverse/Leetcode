/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         // HashMap<ListNode , Integer > map = new HashMap<>() ;

//         // ListNode temp = headA ;

//         // while(temp != null ) {
//         //     map.put(temp , 1 ) ;
//         //     temp = temp.next ;
//         // }
//         // temp = headB ;

//         // while(temp != null ) {
//         //     if(map.containsKey(temp)) return temp ;
//         // }
//         // return null ;
//         //better approach 

//         ListNode temp = headA ;
//         int n1 = 0 ;
//         int n2 = 0 ;

//         while(temp != null ) {
//             n1++ ;
//             temp = temp.next ;
//         }
//         temp = headB ;

//         while(temp != null ) {
//             n2++ ;
//             temp = temp.next ;
//         }

//         if(n1 < n2 ) {
//             return collision(headA , headB , n2 - n1 ) ;
//         }else return collision(headB, headA , n1 - n2 ) ;
//     }

//     ListNode collision(ListNode smallHead , ListNode largeHead , int d) {
//         while(d > 0) {
//             largeHead = largeHead.next ;
//             d-- ;
//         }
//         while(smallHead != largeHead ) {
//             smallHead = smallHead.next ;
//             largeHead = largeHead.next ;
//         }
//         return smallHead ;

//     }
// }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //optimal approach 
        
        if(headA == null || headB == null ) return null ;
        
        ListNode temp1 = headA ;
        ListNode temp2 = headB ;

        while(temp1 != temp2 ) {
            temp1 = temp1.next ;
            temp2 = temp2.next ;

            if(temp1 == temp2 ) return temp1 ;

            if(temp1 == null ) temp1 = headB ;
            if(temp2 == null ) temp2 = headA ;
        }
        

        return temp1 ;
    }
}