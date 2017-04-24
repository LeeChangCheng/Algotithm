package leetcode.Tree;
/**
 * 在一个二叉树上面，
 * 看是否有一条路径上所有的节点的值加起来等与给定的值
 * @author Administrator
 *
 */
public class PathSum {
		public boolean hasPathSum(TreeNode root,int sum){
			if(root==null)
				return false;
			if(root.val==sum&&(root.left==null&&root.right==null))
				return true;
			return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right, sum-root.val);
		}
}
