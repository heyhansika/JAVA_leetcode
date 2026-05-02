class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        // If left child is null → go right
        if (root.left == null)
            return 1 + minDepth(root.right);

        // If right child is null → go left
        if (root.right == null)
            return 1 + minDepth(root.left);

        // If both exist → take minimum
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
