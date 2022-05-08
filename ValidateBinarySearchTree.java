public class ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
        
        if ( root == null ) return false;
        
        Integer prev = null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        
        while (temp != null || !stack.isEmpty()) {
            
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            
            temp = stack.pop();
            
            if (prev != null && temp.val <= prev  )
                return false;
            
            prev = temp.val;
            temp = temp.right;
        }
        
        return true;
    }

}
