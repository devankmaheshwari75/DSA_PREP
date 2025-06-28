public class InorderTrav{

    public static void inorderTrav(TreeNode root){

        if(root == null){
            return ;

        }
        inorderTrav(root.left);
        System.out.println(root.data);
        inorderTrav(root.right);
        

    }


    public static void main(String[] args) {
        
        CreateBT cb   = new CreateBT();
        TreeNode root  = cb.createBT_BFS();

        System.out.println("Inorder traversal of the tree is ");

        inorderTrav(root);





        
        
    }


    
}