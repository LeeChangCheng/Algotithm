package leetcode.Array;

import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
        	if(i!=nums[i])
        		return i;
        }
        return i;
    }
}
