//TC : o(n)
//SC : o(h) ;h - nodes in list at a given level
//https://leetcode.com/problems/binary-tree-level-order-traversal/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode node = q.poll();
                li.add(node.val);
                if(node.left!= null) q.add(node.left);
                if(node.right!= null) q.add(node.right);
            }
            result.add(li);
        }
        return result;
    }
}
