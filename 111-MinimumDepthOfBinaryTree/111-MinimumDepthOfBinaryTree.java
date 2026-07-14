// Last updated: 14/07/2026, 14:02:51
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        // If one child is missing, take the depth from the other child
        if (root.left == null) return 1 + rightDepth;
        if (root.right == null) return 1 + leftDepth;

        return 1 + Math.min(leftDepth, rightDepth);
    }
}
