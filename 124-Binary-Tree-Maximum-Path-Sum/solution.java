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
    int res = Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if(root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);

        int temp = Math.max(root.val + Math.max(left, right), root.val);
        int ans = Math.max(temp, root.val+left+right);
        res = Math.max(ans, res);

        return temp;
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }
}