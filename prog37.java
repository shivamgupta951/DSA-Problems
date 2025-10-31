/* 141. Linked List Cycle
   Given head, the head of a linked list, determine if the linked list has a cycle in it.
   There is a cycle in a linked list if there is some node in the list that can be reached again by 
   continuously following the next pointer. Internally, pos is used to denote the index of 
   the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
   Return true if there is a cycle in the linked list. Otherwise, return false.
   -> 1st Attempt TC ~ O(N) , SC ~ O(1)!
*/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class prog37 {
    public static boolean hasCycle(ListNode head) {
        boolean status = false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                status = true;
                break;
            }
        }
        return status;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;
        System.out.println(hasCycle(head));

    }
}
