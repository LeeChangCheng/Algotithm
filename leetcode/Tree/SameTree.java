<<<<<<< HEAD
package leetcode;
=======
package leetcode.Tree;
>>>>>>> a

public class SameTree {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	        if((p==null&&q!=null)||(p!=null&q==null))
	            return false;
	        if(p==null&&q==null)
	            return true;
	        if(q.val!=p.val)
	            return false;
	        boolean isleftsame=isSameTree(p.left,q.left);
	        if(!isleftsame)//调用自身
	            return false;
	        boolean isrightsame=isSameTree(p.right,q.right);
	        if(!isrightsame)//调用自身
	            return false;
	        return true;    
	        
	    }
}
