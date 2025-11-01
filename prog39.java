/* 2. Add Two Numbers
   You are given two non-empty linked lists representing two non-negative integers.
   The digits are stored in reverse order, and each of their nodes contains a single digit. 
   Add the two numbers and return the sum as a linked list.You may assume the two numbers 
   do not contain any leading zero, except the number 0 itself.
   -> 2nd Attempt TC ~ O(N) , SC ~ O(1) as result nodes are not considered!
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

public class prog39 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode dummy = result;
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1!=null && temp2!=null)
        {
            int digit_sum = 0;
            digit_sum = temp1.val+temp2.val+carry;
            if(digit_sum>9)
            {
                int val = digit_sum%10;
                carry=1;
                dummy.next = new ListNode(val);
                dummy=dummy.next;
            }
            else 
            {
                carry=0;
                dummy.next = new ListNode(digit_sum);
                dummy=dummy.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null)
        {
            int digit_sum = temp1.val + carry;
            if(digit_sum>9)
            {
                int val = digit_sum%10;
                carry = 1;
                dummy.next = new ListNode(val);
                dummy=dummy.next;
            }
            else 
            {
                carry = 0;
                dummy.next = new ListNode(digit_sum);
                dummy=dummy.next;
            }
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            int digit_sum = temp2.val + carry;
            if(digit_sum>9)
            {
                int val = digit_sum%10;
                carry = 1;
                dummy.next = new ListNode(val);
                dummy=dummy.next;
            }
            else 
            {
                carry = 0;
                dummy.next = new ListNode(digit_sum);
                dummy=dummy.next;
            }
            temp2=temp2.next;
        }
        if(carry==1)
        {
            dummy.next = new ListNode(1);
            dummy=dummy.next;
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
        ListNode tail4 = new ListNode(5);
        tail.next = tail2;
        tail2.next = tail3;
        tail3.next = tail4;

        ListNode result = addTwoNumbers(head, tail);
        ListNode temp = result;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
