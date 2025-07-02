public class LCA {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) {
            return root;

        }

        // then we will make the calls for both left and right sid e

        TreeNode lh = lowestCommonAncestor(root.left, p, q);

        TreeNode rh = lowestCommonAncestor(root.right, p, q);

        if (lh != null && rh != null) {
            return root;
        }

        return (lh != null) ? lh : rh;

    }

    public static void main(String[] args) {

        // CreateBT bt = new CreateBT();

        // // Build tree using BFS input from user
        // TreeNode root = bt.createBT_BFS();



    }
}
