class Range_Sum_of_BST {
    int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {

        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }

        if(root.left != null){
            rangeSumBST(root.left, low, high);
        }

        if(root.right != null){
            rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}