
/* 206. Reverse Linked List
   Given the head of a singly linked list, reverse the list, and return the reversed list.
   -> 1st Attempt TC ~ O(N) , SP ~ O(1)!
*/
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class prog35 {

    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode next = null;
        ListNode prev = null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }

    public static void main (String args[])
    {
        ListNode head = new ListNode(1);
        ListNode ele1 = new ListNode(2);
        ListNode ele2 = new ListNode(3);
        head.next=ele1;
        ele1.next=ele2;
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
        ListNode reverse = reverseList(head);
        ListNode temp1 = reverse;
        while(temp1!=null)
        {
            System.out.print(temp1.val+" -> ");
            temp1=temp1.next;
        }
        System.out.println("null");

    }
}
