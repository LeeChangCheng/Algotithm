package leetcode.Tree;
/**
 * ��һ������������������ִ������������ĸ�����Щ��
 * mode ����
 * @author Administrator
 *�����Ƕ�������������ô����������������Ľ����������ģ�
 *��������ֻҪ�Ƚ�ǰ������Ԫ���Ƿ���ȣ�
 *�͵�ͳ�Ƴ���ĳ��Ԫ�س��ֵĴ�������Ϊ��ͬ��Ԫ�ؿ϶��Ƕ���һ��ġ�
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

