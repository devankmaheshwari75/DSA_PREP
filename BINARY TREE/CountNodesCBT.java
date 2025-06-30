//  in this we will calculate the total no of nodes ina complete bianry tree 
//  what is a complete bianry tree 
//  in a complete bianry tree all the levels nodes have complete 2 nodes for each except fot last level 
//  and in that also the nodes should be in the left to rigght manner 
//  like if we there is a gap between theleft nodes that it doesn t have child then no right nodes will have the child after that 

//  this example will be very helpful to undertabd the qyestuon 

//  let's take an example of 7 nodes in a complete bianry tree  

            //                 1
            //             /      \
            //           2          3
            //         /   \      /   \
            //       4     5     6     7
            //     /  \   / \   / 
            //    8   9 10 11 12



public class CountNodesCBT {


    public static int countNodes(TreeNode root ){

        int ld = leftDepth(root);
        int rd  = rightDepth(root);

        if(ld == rd ){
        //  this is a complete binary tree and all the nodes have 2 child and last level also there is max nodes
        return (int)Math.pow(2, ld) - 1 ;

        }

        else{

            return 1+ countNodes(root.left) + countNodes(root.right);

        }


    }

    public static int leftDepth(TreeNode root){

        if(root == null){
            return 0;

        }
        int depth  = 0;
        while(root != null){
            root  = root.left ;
            depth ++;

        }


        return depth ;

    }
    public static int rightDepth(TreeNode root){

          if(root == null){
            return 0;

        }
        int depth  = 0;
        while(root != null){
            root  = root.right  ;
            depth ++;

        }


        return depth ;

    }

    public static void main(String[] args) {

        CreateBT cb  = new CreateBT();
        TreeNode root  = cb.createBT_BFS();

        int cn = countNodes(root);

        System.out.println("The no of nodes in this are "+cn);







    }
    
}

