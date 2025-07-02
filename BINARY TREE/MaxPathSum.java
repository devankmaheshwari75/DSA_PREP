public class MaxPathSum {

    // Recursive helper function to compute the maximum path sum.
    // It updates the global max path sum and returns the max gain from current node upward.
    public static int maxSum(TreeNode root, int max[]) {
        if (root == null) {
            return 0; // Base case: null node contributes 0
        }

        // Recursively get the max path sum of left and right subtree.
        // If it's negative, ignore it by taking 0.
        int ls = Math.max(0, maxSum(root.left, max));
        int rs = Math.max(0, maxSum(root.right, max));

        // This is the case when path passes through both left and right child + current node
        int includingBothLeftAndRight = ls + rs + root.data;

        // Update global maximum if this path is the new highest
        max[0] = Math.max(max[0], includingBothLeftAndRight);

        // Return the maximum gain if we continue the path from current node to parent
        int notIncluding = Math.max(ls, rs) + root.data;

        return notIncluding;
    }

    public static void main(String[] args) {

        // Create an instance of binary tree input handler
        CreateBT bt = new CreateBT();

        // Build tree using BFS input from user
        TreeNode root = bt.createBT_BFS();

        // Array to store global maximum path sum (used to simulate pass-by-reference)
        int max[] = { Integer.MIN_VALUE };

        // Call the recursive function to compute max path sum
        maxSum(root, max);

        // Print the final result
        System.out.println("The max path sum is: " + max[0]);
    }

}
