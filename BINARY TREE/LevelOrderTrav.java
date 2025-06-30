import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTrav {



    public static  void lot(TreeNode root){

        if(root == null){
            return ;

        }

        Queue<TreeNode> q  = new LinkedList<>();
        q.add(root);
        int level = 0;

        while(!q.isEmpty()){
            int size  = q.size();
            level++;
            System.out.println("this is for level"+level);
            for(int i  = 0 ; i< size  ; i++){
                TreeNode node  = q.poll();
                System.out.println(node.data);

                if(node.left !=null ){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);

                }
            }
        }
        

    }

    public static void main(String[] args) {

        CreateBT bt  = new CreateBT();
        TreeNode root = bt.createBT_BFS();

        lot(root);



    }
    
}
