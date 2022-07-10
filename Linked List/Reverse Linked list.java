https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode temp = head;
        ListNode next = null;
        ListNode previous = null;
        while(temp != null){
            next = temp.next;
            temp.next = previous;
            previous = temp;
            temp = next;
        }
        return previous;
    }
}
