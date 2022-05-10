public class BinaryTreeLevelOrderTraversal {


	public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> finalResult = new ArrayList<>();
        if (root == null) return finalResult;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            
            int size = queue.size();
            for (int i=0; i<size;i++) {
                TreeNode curr = queue.remove();
                levelNodes.add(curr.val);
                
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);   
            }
            finalResult.add(levelNodes);
        }
        
        return finalResult;
    }


}
