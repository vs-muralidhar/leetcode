class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = root;
        TreeNode curr = root;
        stack.push(root);
        
        while (!stack.isEmpty()) {
            curr = stack.peek();
            
            boolean isChildNode = (curr.left == null && curr.right == null);
            boolean isSecondTraversal = ( (prev == curr.right) || ( prev == curr.left && curr.right == null) ) ;
            
            if (isChildNode || isSecondTraversal) {
                curr = stack.pop();
                result.add(curr.val);
                prev = curr;
            } else {
                if (curr.right != null) stack.push(curr.right);
                if (curr.left != null) stack.push(curr.left);
            }
            
            
        }
        return result;
    }
}
