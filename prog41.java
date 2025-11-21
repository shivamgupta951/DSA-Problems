/* 19. Remove Nth Node From End of List
   Given the head of a linked list, remove the nth node from 
   the end of the list and return its head.
   -> 1st Attempt TC ~ O(N) , SC ~ O(1)!
*/

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class prog41 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp1 = dummy;
        ListNode temp2 = dummy;

        int count = 0;

        while (temp1.next != null) {
            if (count >= n) {
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
            count++;
        }

        temp2.next = temp2.next.next;
        return dummy.next;
    }

    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(head,2);
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
