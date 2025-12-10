import java.util.*;

/*This is Leetcode 21 to simply merge 2 sorted linked lists;
 * in this one we will be utiliizing recursion.
 * recursion is very hard to follow for me but the jist is that..
 * you are traversing the linked list and comparing the values until you reach the end
 * then you will be connecting the nodes as u recursively travel backwards.
 */

class mergeTwoLL{
    
    static class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}