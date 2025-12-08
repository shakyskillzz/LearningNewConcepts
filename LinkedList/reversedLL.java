import java.util.*;

/*This is Leetcode 206 to simply reverse a linked List;
 * you set 3 temp nodes: a, b, and c.
 * u set a at null and b and c at the head node. then you follow the following algorithm.
 * 1.)c=c.next
 * 2.)b.next = a
 * 3.)a=b
 * 4.)b=c
 * 
 */

class reversedLL{
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
        head = reverseList(head);
        System.out.println(head.val);
    }
    public static ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode a = null;
        ListNode b = head;
        ListNode c = b;

        while(c != null)
        {
            c = c.next;
            b.next = a;
            a = b;
            b = c;
        }
        return a;
    }
}