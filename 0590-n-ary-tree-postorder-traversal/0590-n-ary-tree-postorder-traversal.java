/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> dfs(List<Integer> list , Node root){
        if(root==null)
            return list;
        for( Node i : root.children){
        dfs(list,i);
        }
        list.add(root.val);
    return list;
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return dfs(list,root);
    }
}