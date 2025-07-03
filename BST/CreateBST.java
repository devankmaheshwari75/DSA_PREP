package BST;

public class CreateBST {

    public  static boolean findNode(TreeNode root , int target){
        if(root == null){
            return false ;
        }

        if(root.data == target){
            return true;

        }

        if(root.data > target){
           return  findNode(root.left , target);

        }
        else{
            return findNode(root.right , target);
        }
  
    }


    public static void inorder(TreeNode root){

        if(root == null){
            return ;

        }


        inorder(root.left);
        System.out.print (root.data +" ");
        inorder(root.right  );
    }

    public static TreeNode createBSt(TreeNode root, int target) {

        if (root == null) {
            TreeNode temp = new TreeNode(target);
            return temp;

        }

        if (target > root.data) {
            root.right = createBSt(root.right, target);

        }

        else {
            root.left = createBSt(root.left, target);
        }
        return root;
    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 17, 5, 11, 18, 2, 1, 20, 14 };
        TreeNode root = null;

        for (int i = 0; i < arr.length; i++) {
            root = createBSt(root, arr[i]);

        }

        System.out.println("Created");

        inorder(root);
        int target  = 99;

        boolean ans  = findNode(root , target);
        System.out.println("the target "+target+ " is present in the tree :" +ans);

    }

}


