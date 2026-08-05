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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayDeque<TreeNode> tree = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        tree.offer(root);
        while(!tree.isEmpty()) {
            int size = tree.size();
            List<Integer> ls = new ArrayList<>();
            while(size-- > 0){
                TreeNode currNode = tree.poll();
                ls.add(currNode.val);
                if(currNode.right != null) tree.offer(currNode.right);
                if(currNode.left != null) tree.offer(currNode.left);
            }
            ans.add(ls.get(0));
        }
        return ans;
    }
}