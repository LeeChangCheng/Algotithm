<<<<<<< HEAD
package leetcode;
=======
package leetcode.Tree;
>>>>>>> a

import javax.swing.tree.TreeNode;

public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
	        if(root==null)
	            return true;
	        return isMirror(root.left,root.right);      
	                
	    
	    }
//	     public boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
//	         if (leftNode == null && rightNode == null) {
//	             return true;
//	         } else if (
//	             (leftNode != null && rightNode == null) ||
//	             (leftNode == null && rightNode != null) ||
//	             leftNode.val != rightNode.val ||
//	             !isMirror(leftNode.left, rightNode.right) ||
//	             !isMirror(leftNode.right, rightNode.left)) {
//	             return false;
//	         } else {
//	             return true;
//	         }
//	     }
	// }

	    public boolean isMirror(TreeNode q,TreeNode p){
	        if (q== null&&p==null) 
	            return true;
	        else if(//(q.val!=p.val)||
	          (q==null&&p!=null)||
	          (q!=null&&p==null)||
	          (q.val!=p.val)||
	          (!isMirror(q.left,p.right))||
	          (!isMirror(q.right,p.left))
	          ) 
	            return false;
	        else
	            return true;
	        //return true;    
	        
	        
	    }
}
