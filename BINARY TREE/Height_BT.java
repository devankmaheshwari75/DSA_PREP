public class Height_BT {


    public static  int height(TreeNode root){

        if(root == null){
            return 0;

        }

        return Math.max(height(root.left) , height(root.right)) +1 ;

    }
    public static void main(String[] args) {

         CreateBT bt  = new CreateBT();
        TreeNode root = bt.createBT_BFS();
        int height   = height(root);
        System.out.println("height of the tree is "+height);
        
    }
    
}
