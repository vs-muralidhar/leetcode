class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if ( root == null ) return new ArrayList<Integer>();
        
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            
            TreeNode curr = stack.pop();
            result.add(curr.val); 
            
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }
        
        return result;
    }
}
