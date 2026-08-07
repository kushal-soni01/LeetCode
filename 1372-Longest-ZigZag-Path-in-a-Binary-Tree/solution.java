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
    int maxDepth = 0;
    public void depthZigZag(TreeNode root, String turn, int count){
        if(root == null) return;
        if(count > maxDepth) maxDepth = count;
        if(turn == "left" || turn == ""){
            depthZigZag(root.right, "right", 1+count);
        }
        else{
            depthZigZag(root.right, "right", 1);
        }

        if(turn == "right" || turn == ""){
            depthZigZag(root.left, "left", 1+count);
        }
        else{
            depthZigZag(root.left, "left", 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        depthZigZag(root, "", 0);
        return maxDepth;        
    }
}