package _83_removeDuplicatesFromLinkedList;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicatesFromLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.val == current_node.next.val) {
                current_node.next = current_node.next.next;
            }
            else {
                current_node = current_node.next;
            }
        }
        return head;
    }
}
