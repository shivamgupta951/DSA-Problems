/* 83. Remove Duplicates from Sorted List
   Given the head of a sorted linked list, delete all duplicates such that each element 
   appears only once. Return the linked list sorted as well.
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

public class prog40 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                curr = curr.next;
            } else {
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        prev.next = null;
        return head;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
