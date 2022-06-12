class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        
        while (!isLowestCommonAncestor(node, p, q)) {
            if (node.val > p. val) {
                node = node.left;
            } else if (node.val < p.val) {
                node = node.right;
            }
        }
        
        return node;
    }
    
    private boolean isLowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        int minValue = Math.min(p.val, q.val);
        int maxValue = Math.max(p.val, q.val);
        return node.val >= minValue && node.val <= maxValue;
    }
}
