import java.util.LinkedList;
import java.util.Queue;

public class RightView {

     public static void rightViewBFS(TreeNode root) {
        if (root == null) {
            return;

        }
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == size-1) {
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

        rightViewBFS(root);

    }

    
}
