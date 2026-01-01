import java.util.*;
/*      leetcode 138, make a deep copy of a linked list with .nxt and .random pointers
    There was 2 methods of doing this while, i did the easier to understand using hashmaps
    you loop through it all once making copys of each node <Node, Node> and mapping it to each other
    then you loop through it again this time matching it with the node you have.

*/
class copyListRandomPointer{
    static class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args){

    }
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        if(head == null)
            return head;
        Node temp = head;
        while(temp != null)
        {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        map.put(null, null);
        temp = head;

        while(temp != null)
        {
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
    
}