package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 判断一个二叉树是否为二叉搜索树。
 * @author Administrator
 *二分查找树的中序遍历结果是一个递增序列。
 */
public class ValidateBinarySearchTree {
	List<Integer> list = new ArrayList<Integer>();  
    
    public boolean isValidBST(TreeNode root) {  
        if (root == null) return true;  
        if (root.left == null && root.right == null) return true;  
        inOrderTraversal(root);  
        for (int i = 1; i < list.size(); i++) {  
            if (list.get(i) <= list.get(i - 1)) return false;  
        }  
        return true;  
     }  
      
    public void inOrderTraversal(TreeNode root) {  
        if (root == null) return;  
        inOrderTraversal(root.left);  
        list.add(root.val);  
        inOrderTraversal(root.right);  
    }  
}
