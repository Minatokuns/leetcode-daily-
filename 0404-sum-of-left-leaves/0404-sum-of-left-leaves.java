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
    public int dfs(TreeNode root,String cur){
        if(root ==null)
            return 0;
        int sum=0;
        if(root.left==null && root.right==null && cur=="Left")
            sum= sum+ root.val;
        cur="Left";
        sum= sum+dfs(root.left,cur);
        cur="Right";
        sum=sum+dfs(root.right,cur);
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        String cur ="";
        return dfs(root,cur);
    }
}