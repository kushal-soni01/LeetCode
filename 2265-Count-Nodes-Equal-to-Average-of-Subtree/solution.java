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
    public int[] getAvg(TreeNode root, int[] count){
        if(root == null) return new int[]{0, 0};

        int[] left = getAvg(root.left, count);
        int[] right = getAvg(root.right, count);

        if((left[0] + right[0] + root.val)/(1+left[1]+right[1]) == root.val) count[0]++;
        return new int[] {root.val + left[0] + right[0], 1 + left[1] + right[1]};
    }
    public int averageOfSubtree(TreeNode root) {
        int[] count = {0};
        getAvg(root, count);
        return count[0];
    }
}