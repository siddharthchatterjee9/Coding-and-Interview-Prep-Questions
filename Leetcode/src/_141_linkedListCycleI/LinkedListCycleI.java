package _141_linkedListCycleI;

// https://leetcode.com/problems/linked-list-cycle/

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

public class LinkedListCycleI {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode turtle = head;
        ListNode rabbit = head.next;

        while (turtle != rabbit) {
            if (rabbit == null || rabbit.next == null) {
                return false;
            }
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        return true;
    }
}
