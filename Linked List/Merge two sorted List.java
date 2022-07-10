https://leetcode.com/problems/merge-two-sorted-lists/

// brute force approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = null;
        temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                temp = temp.next;
            }
            temp = temp.next;
        }
        if(list1 == null){
            temp.next = list2;
        }
        else{
            temp.next = list1;
        }
        return dummy.next;
    }
}

// optimized approach using recursion
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
// time complexity => O(2^n)
