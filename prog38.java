/* 2. Add Two Numbers
   You are given two non-empty linked lists representing two non-negative integers.
   The digits are stored in reverse order, and each of their nodes contains a single digit. 
   Add the two numbers and return the sum as a linked list.You may assume the two numbers 
   do not contain any leading zero, except the number 0 itself.
   -> 1st Attempt TC ~ O(N) , SC ~ O(1) as result nodes are not considered!
   Not Optimal for Leetcode.
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

public class prog38 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value1 = 0;
        int value2 = 0;
        int tending1 = 1;
        int tending2 = 1;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode result = new ListNode(-1);
        while (temp1 != null) {
            value1 += tending1 * temp1.val;
            temp1 = temp1.next;
            tending1 *= 10;
        }
        while (temp2 != null) {
            value2 += tending2 * temp2.val;
            temp2 = temp2.next;
            tending2 *= 10;
        }
        int sum = value1 + value2;
        if (sum == 0)
            return new ListNode(0);
        ListNode tail = result;
        while (sum > 0) {
            int temp = sum % 10;
            tail.next = new ListNode(temp);
            tail = tail.next;
            sum = sum / 10;
        }
        return result.next;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(2);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        head.next = head2;
        head2.next = head3;

        ListNode tail = new ListNode(5);
        ListNode tail2 = new ListNode(6);
        ListNode tail3 = new ListNode(4);
        tail.next = tail2;
        tail2.next = tail3;

        ListNode result = addTwoNumbers(head, tail);
        ListNode temp = result;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
