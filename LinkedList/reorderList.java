import java.util.*;
/*  Leetcode 143
 * In this leetcode we reorder a linked list of size n to L1 -> Ln -> L2 -> Ln-1 ...
 * We used a stack to traverse from the back going backwards.
 * and used a walker pointer from the head to traverse untill we meet in the middle
 * (There is a recursive way that is much faster but utilizing a stack is the most easiest for me to understand.)
 */

 class reorderList{
    static class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args){
        System.out.println("Herro!");
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode walker = head;
        while(walker != null)
        {
            stack.push(walker);
            walker = walker.next;
        }
        walker = head;
        ListNode b = head.next;
        ListNode temp = null;
        int size = stack.size();
        for(int i = 0; i < size / 2; i++){
            temp = stack.pop();
            walker.next = temp;
            walker = b;
            b = b.next;
            temp.next = walker;
        }
        walker.next = null;
    }
 }