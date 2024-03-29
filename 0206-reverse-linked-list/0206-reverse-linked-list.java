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
    /*
    // iterative method
    public ListNode reverseList(ListNode head) {
        if(head == null)  return null;
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    */
    
    // Recursive Method
    public ListNode reverseList(ListNode head){
        
        if(head == null || head.next == null)  return head;
        
        // reverse the rest list and put the first element at the end .
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return rest;
    }
}