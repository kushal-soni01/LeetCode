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
    // public void displayLL(ListNode head){
    //     while(head != null){
    //         System.out.print(head.val + "->");
    //         head = head.next;
    //     }
    //     System.out.println();
    // }
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reversal first part
        ListNode prev = null, curr = head, next = head;
        while(curr != slow){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // displayLL(prev);
        // displayLL(slow);
        
        int ans = 0;
        while(prev != null){
            ans = Math.max(ans, prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }

        return ans;
    }
}