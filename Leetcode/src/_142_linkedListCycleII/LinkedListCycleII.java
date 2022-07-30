package _142_linkedListCycleII;

// https://leetcode.com/problems/linked-list-cycle-ii/

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

public class LinkedListCycleII {
    public ListNode intersection (ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode intersect = intersection(head);
        if (intersect == null) {
            return null;
        }
        ListNode start = head;
        while (intersect != start) {
            start = start.next;
            intersect = intersect.next;
        }
        return start;
    }
}
