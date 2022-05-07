public class BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
        if ( root == null ) return new ArrayList<Integer>();
        
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        
        while (temp != null || !stack.isEmpty()) {
            
            while (temp != null) {
                stack.push(temp);
                temp=temp.left;
            }
            
            temp = stack.pop();
            result.add(temp.val); 
            
            temp = temp.right;
        }
        
        return result;
    }

}
