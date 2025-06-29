import java.util.Stack;

public class PreOrder {


    public static void preorder_Iterative(TreeNode root ){

        Stack<TreeNode> stack  = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node  = stack.pop();
            System.out.println(node.data);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }

    }


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
