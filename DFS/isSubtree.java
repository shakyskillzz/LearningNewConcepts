/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 /*
  * This is Leetcode 572
  It simply gives you two trees, and you have to check if the second one is a subtree of the first.
  we use DFS in another function that checks if two trees passed in are the same
  in the main function we are traversing through JUST the main tree recursively and actively checking each node if it is the same tree
  as the subtree
  */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null)
            return true;
        if(root == null)
            return false;
        if(isSameTree(root, subRoot))
            return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public static boolean isSameTree(TreeNode a, TreeNode b){
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        if(a.val != b.val)
            return false;

        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }

}