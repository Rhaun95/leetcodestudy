class Range_Sum_of_BST {
    int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {

        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }

        if (root.left != null) {
            rangeSumBST(root.left, low, high);
        }

        if (root.right != null) {
            rangeSumBST(root.right, low, high);
        }

        return sum;
    }
    /**
     * Time Complexity : O(n)
       The algorithm visits each node in the binary tree once, resulting in a linear time complexity.

     * Space Compexity : O(1)
      Since the algorithm uses only one global variable, there is no need for additional memory space.
      Thus, the space complexity remains constant.
    */
}