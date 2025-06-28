import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateBT {

    public TreeNode createBT_BFS() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root element x : ");

        int x = sc.nextInt();


        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int first  ,  second;
        while (!q.isEmpty()) {
            
            int size   = q.size();

            for(int i = 0 ; i<size ; i++){
                TreeNode curr =  q.poll();
                System.out.println("Enter the left child :");
                first = sc.nextInt();
                if(first != -1){
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
         return root ;
    }

    public static void main(String[] args) {

        CreateBT cb = new CreateBT();
        cb.createBT_BFS();


    }

}
