package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 * @author Administrator
 *把nums[Math.abs(nums[i])-1]标负.
 * 第二次遍历时若nums[i]非负，就表明原array没有i+1, 加到res里
 */
public class FindAllNumbersDisappearedInAnArray { 
	public List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> res = new ArrayList<Integer>();
	        if(nums == null || nums.length == 0){
	            return res;
	        }	        
	        for(int i = 0; i<nums.length; i++){
	            int index = Math.abs(nums[i])-1;
	            if(nums[index] > 0){
	                nums[index] = -nums[index];
	            }
	        }	        
	        for(int i = 0; i<nums.length; i++){
	            if(nums[i] > 0){
	                res.add(i+1);
	            }
	        }	        
	        return res;
	}
}
