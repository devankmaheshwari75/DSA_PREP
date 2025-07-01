public class isBalanced {



    public static  int height (TreeNode root  ,  boolean valid[]){

        if(root == null || !valid[0]) {
            return 0;
        }

        int lh  = height(root.left, valid);
        int rh  = height(root.right, valid);

        if(Math.abs(lh-rh)>1){
            valid[0] = false;
        }

        return Math.max(lh,rh) +1;


    }

    public static void main(String[] args) {
        CreateBT bt = new CreateBT();
        TreeNode root = bt.createBT_BFS();


        boolean valid[]  = new boolean[1] ;
        valid[0] = true;



        height(root ,valid );

        System.out.println("Is the tree balanced ? " + valid[0]);

    }
}
