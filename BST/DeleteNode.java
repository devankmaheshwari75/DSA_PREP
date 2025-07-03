package BST;

public class DeleteNode {

    public static TreeNode deleteNode(TreeNode root, int target) {
        if (root == null)
            return null;

        if (root.data > target) {
            root.left = deleteNode(root.left, target);
        }

        else if (root.data < target) {
            root.right = deleteNode(root.right, target);

        }

        else {
            // now in this the root is the target node
            // so we have to delete it
            // now there can be threee cases
            // 1. root has no child
            // 2. root has one child
            // 3. root has two child

            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            TreeNode successor = findMin(root.right);
            root.data = successor.data;
            root.right = deleteNode(root.right, successor.data);

        }

        return root;
    }

    public static TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;

        }

        return root;

    }

    public static void main(String[] args) {

        CreateBST cb = new CreateBST();
        TreeNode root = null;

        int arr[] = { 45, 30, 70, 20, 35, 60, 80, 10, 50, 75, 90, 77 };

        for (int i : arr) {
            root = cb.createBSt(root, i);

        }

        System.out.println("Binary tree created ");

        cb.inorder(root);
        int target = 45;

        // We are not doing: root = deleteNode(root, target);
        // still it works because in this case, we are just replacing the data of the
        // root node
        // with its inorder successor's value. The root pointer remains the same.
        // If we were actually replacing the root node itself (like when it has only one
        // child or is a leaf),
        // then root = deleteNode(...) would be necessary to update the pointer in main.
        deleteNode(root, target);
        System.out.println("deleted successfully");

        cb.inorder(root);

    }

}