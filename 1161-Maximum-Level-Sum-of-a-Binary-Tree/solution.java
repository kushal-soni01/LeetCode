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
    public int maxLevelSum(TreeNode root) {
        ArrayDeque<TreeNode> tree = new ArrayDeque<>();
        int sum = Integer.MIN_VALUE, idx = 1, ans = 1;
        tree.offer(root);
        while(!tree.isEmpty()){
            int currSum = 0;
            int size = tree.size();
            while(size-- > 0){
                TreeNode node = tree.poll();
                currSum+=node.val;
                if(node.left != null) tree.offer(node.left);
                if(node.right != null) tree.offer(node.right);
            }
            if(currSum > sum) {
                sum = currSum;
                ans = idx;
            }
            idx++;
        }
        return ans;
    }
}