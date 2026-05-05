/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) return head;

    // First, find the length to handle large k
    ListNode temp = head;
    int len = 0;
    while (temp != null) {
        len++;
        temp = temp.next;
    }
    k %= len;
    if (k == 0) return head;

    ListNode fast = head, slow = head;
    // Move fast k steps ahead
    for (int i = 0; i < k; i++) fast = fast.next;

    // Move both until fast is at the tail
    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }

    ListNode newHead = slow.next;
    slow.next = null; // Break the link
    fast.next = head; // Connect old tail to old head

    return newHead;
}
}