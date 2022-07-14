package _2_addTwoNumbers;

// https://leetcode.com/problems/add-two-numbers/

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/* Just like how you would sum two numbers on a piece of paper,
    we begin by summing the least-significant digits, which is the head of l1 and l2.
    Since each digit is in the range of 0...9, summing two digits may "overflow".
    For example 5 + 7 = 12. In this case, we set the current digit to 2 and bring over the carry = 1 to the next iteration.
    carry must be either 0 or 1 because the largest possible sum of two digits (including the carry) is 9 + 9 + 1 = 19
 */
// imo go left to right when adding (instead of the classic right to left) that's it
public class Main {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            int current_sum = l1_val + l2_val + carry;
            carry = current_sum / 10;
            int last_digit = current_sum % 10;
            ListNode new_node = new ListNode(last_digit);
            l3.next = new_node;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (carry > 0) {
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }
        return dummy_head.next;
    }
}