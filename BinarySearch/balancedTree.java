import java.util.*;
/*
 * This is leetcode 110 and it uses DFS to to check if a Binary tree is balanced.
 * it first uses a seperate function that utilizes DFS to check the height of the left and right of a node.
 * with those numbers u constantly check if the abs difference is more than 1, hence meaning it is not balanced.
 * if its not, then u continue by returning the max height + 1
 */

 class balancedTree{
    public static void main(String[] args){
        TreeNode r = new TreeNode();
        r.right = new TreeNode();
        r.left = new TreeNode();
        r.right.right = new TreeNode();
        
    }

    public static boolean isBalanced(TreeNode root) 
    {
        return checkHeight(root) != -1;
    }

    public static int checkHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = checkHeight(root.left);
        if(left == -1)
            return -1;
        
        int right = checkHeight(root.right);
        if(right == -1)
            return -1;

        if(Math.abs(left - right) > 1) 
            return -1;

        return Math.max(left,right) + 1;
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