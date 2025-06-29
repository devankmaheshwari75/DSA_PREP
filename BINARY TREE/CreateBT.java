import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateBT {
    Scanner sc = new Scanner(System.in);

    public TreeNode createBT_DFS() {
        System.out.println("Enter the node value ");
        int x = sc.nextInt();

        if(x == -1){
            return null;
        }
        TreeNode temp = new TreeNode(x);

        temp.left = createBT_DFS();
        temp.right = createBT_DFS();

        return temp;

    }

    public TreeNode createBT_BFS() {

        System.out.println("Enter the root element x : ");

        int x = sc.nextInt();

        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int first, second;
        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                System.out.println("Enter the left child :");
                first = sc.nextInt();
                if (first != -1) {
                    curr.left = new TreeNode(first);
                    q.add(curr.left);

                }

                System.out.println("Enter the right child : ");
                second = sc.nextInt();

                if (second != -1) {
                    curr.right = new TreeNode(second);
                    q.add(curr.right);
                }

            }

        }

        sc.close();
        return root;
    }

    public static void main(String[] args) {

        CreateBT cb = new CreateBT();
        // cb.createBT_BFS();
        cb.createBT_DFS();

    }

}
