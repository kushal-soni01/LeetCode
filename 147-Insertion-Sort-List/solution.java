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
    public ListNode insertionSortList(ListNode head) {
        ListNode ptr1 = head;
        while(ptr1!=null){
            ListNode ptr2 = ptr1; 
            while(ptr2!=null){
                if(ptr1.val>ptr2.val){
                    int temp = ptr1.val;
                    ptr1.val = ptr2.val;
                    ptr2.val = temp;
                }
                ptr2 = ptr2.next;
            }
            ptr1=ptr1.next;
        }
        return head;
    }
}