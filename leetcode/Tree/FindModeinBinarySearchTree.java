package leetcode.Tree;
/**
 * 给一个二叉搜索树，求出现次数最多的数是哪个（哪些）
 * mode 众数
 * @author Administrator
 *由于是二分搜索树，那么我们中序遍历出来的结果就是有序的，
 *这样我们只要比较前后两个元素是否相等，
 *就等统计出现某个元素出现的次数，因为相同的元素肯定是都在一起的。
 */
       class TreeNode {
	     int val;
	      TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	     }
public class FindModeinBinarySearchTree {
	private int currentModes = 0;
    private int currentValue = 0;
    private int currentCount = 0;
    private int modes[];
    private int maxCount = 0;
    
    public int[] findMode(TreeNode root){
    	helper(root);
    	modes=new int[currentModes];
    	currentModes=0;
    	currentCount=0;
    	helper(root);
    	return modes;
    }
    
    private void helper(TreeNode root){
    	if(root==null) return;
    	
    	helper(root.left);
    	
    	if(root.val!=currentValue){
    		currentCount=1;
    		currentValue=root.val;
    	}else{
    		currentCount++;
    	}
    	
    	if(currentCount>maxCount){
    		maxCount=currentCount;
    		 currentModes = 1;
        } else if (currentCount == maxCount) {
            if (modes != null)
                modes[currentModes] = root.val;
            currentModes++;
        }
        
        helper(root.right);
    	}
    }

