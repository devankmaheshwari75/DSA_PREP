public class PostOrder {

    public static void postOrder(TreeNode root) {

        if (root == null) {
            return;

        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }

    public static void main(String[] args) {
        CreateBT cb = new CreateBT();
        TreeNode root = cb.createBT_BFS();

        System.out.println("Postorder traversal of the tree is ");

        postOrder(root);

    }

}
