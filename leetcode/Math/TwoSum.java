package leetcode;

import java.util.Arrays;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
	        int[] result=new int[2];
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=0;j<i;j++)
	            {
	                if((nums[i]+nums[j])==target)
	                {
	                    result[0]=j;
	                    result[1]=i;
	                  
	                }
	             }
	            
	        
	        }
	        return result;
	      }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a={3,2,4};
		int b=6;
		System.out.println(Arrays.toString(twoSum(a,b)));
	}

}
