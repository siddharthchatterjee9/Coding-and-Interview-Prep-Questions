package _203_removeLinkedListElements;

// https://leetcode.com/problems/remove-linked-list-elements/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.next.val == val) {
                current_node.next = current_node.next.next;
            }
            else {
                current_node = current_node.next;
            }
        }
        return head;
    }
}
