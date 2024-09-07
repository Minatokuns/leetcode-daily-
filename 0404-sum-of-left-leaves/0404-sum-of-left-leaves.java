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
    int sum = 0;
    public void dfs(TreeNode root,String cur){
        if(root ==null)
            return;
        if(root.left==null && root.right==null && cur=="Left")
            sum= sum+ root.val;
        cur="Left";
        dfs(root.left,cur);
        cur="Right";
        dfs(root.right,cur);
        return;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        
        String cur ="";
        dfs(root,cur);
        return sum;
    }
}