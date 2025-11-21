/* 160. Intersection of Two Linked Lists
   Write a program to find the node at which the intersection of two 
   singly linked lists begins. If no intersection, return null.

   -> Using Two Pointer Method
   -> 1st Attempt TC ~ O(N + M), SC ~ O(1)!
*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class prog43 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {
            // if pointer reaches end, switch to other list
            if (temp1 == null) {
                temp1 = headB;
            } else {
                temp1 = temp1.next;
            }

            if (temp2 == null) {
                temp2 = headA;
            } else {
                temp2 = temp2.next;
            }
        }

        // temp1 == temp2 (either intersection node or null)
        return temp1;
    }
}
