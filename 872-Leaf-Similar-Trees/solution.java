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
    public void leafOrder(TreeNode root, List<Integer> list){
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        if(root.left != null) leafOrder(root.left, list);
        if(root.right != null) leafOrder(root.right, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        leafOrder(root1, list1);
        leafOrder(root2, list2);
        return list1.equals(list2);
    }
}