package leetcode.Tree;
/**
 * 最大左右子树深度和
 * @author Administrator
 *
 */
public class DiameterOfBinaryTree{
	 private int maxDiameter = Integer.MIN_VALUE;
	    
	    public int diameterOfBinaryTree(TreeNode root) {
	        if (root == null || (root.left == null && root.right == null)) return 0;
	        
	        getHeight(root);
	        return maxDiameter;
	    }
	    
	    private int getHeight(TreeNode root) {
	        if (root == null) return 0;
	        if (root.left == null && root.right == null) return 1;
	        
	        int leftHeight = getHeight(root.left);
	        int rightHeight = getHeight(root.right);
	        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
	        return 1 + Math.max(leftHeight, rightHeight);
	    }
}
