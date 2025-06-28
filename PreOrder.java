public class PreOrder {


    public static void preOrder(TreeNode root){

          if(root == null){
            return ;

        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
        

    }

    public static void main(String[] args) {
         CreateBT cb   = new CreateBT();
        TreeNode root  = cb.createBT_BFS();

        System.out.println("Preorder traversal of the tree is ");

        preOrder(root);

        
    }
    
}
