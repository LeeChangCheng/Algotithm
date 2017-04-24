package leetcode.Array;
/**
 * 给定一个n个长度的数组，将它循环右移k个位置
 * @author Administrator
 *先将k转换成[0, n-1]内的数,对整个数组进行翻转，再对[0, k-1]位置的数字进行反转，再对剩下的部分进行翻转
 */
public class RotateArray {
	public void rotate(int[] nums,int k){
		
		int tmp;
		
		k = k%nums.length;
		
		for(int i=0,j=nums.length-1;i<j;i++,j--){
			tmp=nums[i];
			nums[i]=nums[j];
			nums[j]=tmp;
		}
		
		for (int i=0,j=k-1;i< j;i++,j--){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i=k, j=nums.length-1;i<j;i++,j--){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
		
	}
}
