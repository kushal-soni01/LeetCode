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
class Solution {
    public int countGood(TreeNode root, int max){
        if(root == null) return 0;
        return root.val >= max ? 1 + countGood(root.left, root.val) + countGood(root.right, root.val) : countGood(root.left, max) + countGood(root.right, max);
    }
    public int goodNodes(TreeNode root) { 
        return countGood(root, root.val);
    }
}