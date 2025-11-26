import java.util.*;

class maxDepth{
    public static void main(String[] args){
        TreeNode r = new TreeNode();
        r.right = new TreeNode();
        r.left = new TreeNode();
        r.right.right = new TreeNode();
        System.out.println(maxDepth(r));
    }

    static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
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