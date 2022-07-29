package _876_findMiddleOfLinkedList;

// https://leetcode.com/problems/middle-of-the-linked-list/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class FindMiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while (b.next != null) {
            if (b.next.next == null) {
                a = a.next;
                break;
            }
            a = a.next;
            b = b.next.next;
        }
        return a;
    }
}
