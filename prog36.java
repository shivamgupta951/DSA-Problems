/* 876. Middle of the Linked List
   Given the head of a singly linked list, return the middle node of the linked list.
   If there are two middle nodes, return the second middle node.
   -> 1st Attempt TC ~ O(N) , SC ~ O(1)
*/
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class prog36 {
    public static ListNode middleNode(ListNode head)
    {
        ListNode temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int value = 0;
        ListNode middle = head;        
        int middle_value = count/2;
        while(value<middle_value)
        {
            middle=middle.next;
            value++;
        }
        return middle;
    }

    public static void main(String args[])
    {
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        head.next=head2;
        head2.next=head3;
        head3.next=head4;
        ListNode result = middleNode(head);
        System.out.println(result.val);
    }
}
