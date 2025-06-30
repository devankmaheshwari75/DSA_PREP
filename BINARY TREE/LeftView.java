import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

    public static void leftViewBFS(TreeNode root) {
        if (root == null) {
            return;

        }
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == 0) {
                    System.out.print(node.data + " ");

                }

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

    }

    public static void main(String[] args) {

        CreateBT bt = new CreateBT();
        TreeNode root = bt.createBT_BFS();

        leftViewBFS(root);

    }

}
