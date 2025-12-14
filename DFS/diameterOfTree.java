import java.util.*;

/*
 * This is leetcode 543 
 * in this one you are finding the biggest diameter
 * a diameter of a tree is the longest length between 2 nodes or aka num of edges
 * You utilize DFS in this one by always counting the path between nodes and keeping track of the greatest one as u recursively go back
 */

class diamterOfTree{

    public static void main(String[] args){
        TreeNode r = new TreeNode();
        r.right = new TreeNode();
        r.left = new TreeNode();
        r.right.right = new TreeNode();
        System.out.println(diameterOfBinaryTree(r));
    }

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    private int height(TreeNode root){
        if(root == null)
            return 0;
        
        int left = height(root.left);

        int right = height(root.right);    

        int path = left + right;

        if(path > max)
            max = path;

        return 1 + Math.max(left,right);
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