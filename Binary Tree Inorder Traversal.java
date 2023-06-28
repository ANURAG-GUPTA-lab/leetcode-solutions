 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<Integer>();
        dfs(rst, root);
        return rst;

    }

    

    public void dfs(List<Integer> rst, TreeNode node) {
        if (node == null) return;
        dfs(rst, node.left);
        rst.add(node.val);
        dfs(rst, node.right);
    }
}
