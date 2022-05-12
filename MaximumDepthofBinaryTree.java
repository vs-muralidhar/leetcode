public class MaximumDepthofBinaryTree {

	public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return depth;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            
            for (int i=0; i<size; i++) {
                TreeNode curr = q.poll();
                
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            depth++;
        }
        
        return depth;
    }

}

