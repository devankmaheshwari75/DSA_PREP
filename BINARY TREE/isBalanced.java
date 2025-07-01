public class isBalanced {

    // This function computes the height of the tree in a bottom-up DFS manner
    // It also checks at each node if the tree is height-balanced or not.
    // A tree is height-balanced if at every node, |left height - right height| <= 1

    public static int height(TreeNode root, boolean[] valid) {

        // If root is null, height is 0 (node-based height)
        // If we've already found imbalance, skip further recursion
        if (root == null || !valid[0]) {
            return 0;
        }

        int lh = height(root.left, valid);  // height of left subtree
        int rh = height(root.right, valid); // height of right subtree

        // If the height difference is more than 1, mark tree as not balanced
        if (Math.abs(lh - rh) > 1) {
            valid[0] = false;
        }

        // Return the height of the current node as 1 + max of left/right
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        CreateBT bt = new CreateBT(); // Custom binary tree builder (BFS style)
        TreeNode root = bt.createBT_BFS(); // root of the binary tree

        boolean[] valid = new boolean[1]; // wrapper to allow pass-by-reference
        valid[0] = true; // assume tree is balanced initially

        height(root, valid); // compute height and check balance in one pass

        System.out.println("Is the tree balanced ? " + valid[0]);
    }
}
