1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        if (head == null || head.next == null)
14            return;
15        ListNode slow = head;
16        ListNode fast = head;
17        while (fast.next != null && fast.next.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21        ListNode curr = slow.next;
22        slow.next = null;
23        ListNode prev = null;
24        while (curr != null) {
25            ListNode nextNode = curr.next;
26            curr.next = prev;
27            prev = curr;
28            curr = nextNode;
29        }
30        ListNode temp3 = head;
31        ListNode main = prev;
32        while (main != null) {
33            ListNode temp1 = temp3.next;
34            ListNode temp2 = main.next;
35
36            temp3.next = main;
37            main.next = temp1;
38
39            temp3 = temp1;
40            main = temp2;
41        }
42    }
43}