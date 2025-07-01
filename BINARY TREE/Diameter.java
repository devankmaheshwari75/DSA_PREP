public class Diameter {
    // so we will encounter 2 types of questions if we are working on nodes then in
    // base case
    // we will return 0 okk
    // if we are working on edges then in base case we will return -1 okk


    //  here in the diameter we have taken +2 because we are adding the left height and right height but we have not added the edge which connect the current node to the below root.left and root.right so that is why we are adding the +2 
    //  it will also take care of itself in the case if root.left is null becausw we are returning the -1 if its null so it is taken care of 

    public static int height(TreeNode root, int max[]) {
        if (root == null) {
            return -1;
        }

        int lh = height(root.left, max);
        int rh = height(root.right, max);
        int diameterThroughNode = lh + rh + 2;
        max[0] = Math.max(diameterThroughNode, max[0]);

        return Math.max(lh, rh) + 1;

    }

    public static void main(String[] args) {

        CreateBT bt = new CreateBT();
        TreeNode root = bt.createBT_BFS();


        int max[] = {0};
        height(root, max);

        System.out.println("THE DIAMETER OF TREE IS : "+max[0]);

    }

}
