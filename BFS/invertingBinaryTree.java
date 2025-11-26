import java.util.*;
/*Using BFS to invert a binary tree.
 * you start by queueing in the root if there is one, then you loop through the Queue so long as it is not empty. (.isempty())
 * Everytime u deque (.poll()) you simply add .left and .right to the queue so long as it is not null
 * then u switch the right and left. and continue
 */

class invertingBinaryTree{

    public static void main(String[] args){
        TreeNode r = new TreeNode();
        r.val = 10;
        r.left = new TreeNode();
        r.left.val = 4;
        r.right = new TreeNode();
        r.right.val = 20;
        invertTree(r);
        System.out.println(r.val);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode n;

        while(!q.isEmpty())
        {
            n = q.poll();
            if(n.left != null)
                q.add(n.left);
            if(n.right != null)
                q.add(n.right);
            TreeNode temp = n.left;
            n.left = n.right;
            n.right = temp;

        }
        return root;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

