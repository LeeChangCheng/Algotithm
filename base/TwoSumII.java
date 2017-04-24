package base;
/**
 * 给出一个数，和一个降序排列的数组
 * 求出和为给出数的两数的下标+1
 * @author Administrator
 *
 *两头pointer向中间移动
 */
public class TwoSumII {
	public int[] twoSum(int[] nums, int target) {  
		if(nums==null||nums.length==0) return null;
		int i=0,j=nums.length-1;//pointer
		
		while(i<j){
			int x=nums[i]+nums[j];
			if(x<target){
				i++;
			}else if(x>target){
				j--;
			}else{
				return new int[]{i+1,j+1};
			}
		}
		return null;
	}
}
