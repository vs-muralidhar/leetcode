/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        stack.push(root);
        parentMap.put(root, null);
        
        while (!parentMap.containsKey(p) || !parentMap.containsKey(q)) {
            // find p,q
            TreeNode curr = stack.pop();
            
            if (curr.right != null) {
                stack.push(curr.right);
                parentMap.put(curr.right, curr);
            }
            
            if (curr.left != null) {
                stack.push(curr.left);
                parentMap.put(curr.left, curr);
            }
        }
        
        Set<TreeNode> ancestorsForP = new HashSet<>();
        while (p != null) {
            ancestorsForP.add(p);
            p = parentMap.get(p);
        }
        while (!ancestorsForP.contains(q)) {
            q = parentMap.get(q);
        }
        return q;
        
        
    }
}
