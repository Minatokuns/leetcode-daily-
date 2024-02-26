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
    public List<Integer> dfs(List<Integer> list , TreeNode root){
        if(root==null){
            list.add(null);
            return list;
        }
        list.add(root.val);
        dfs(list,root.left);
        dfs(list,root.right);
        return list;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        return dfs(list,p).equals(dfs(list1,q));
    }
}