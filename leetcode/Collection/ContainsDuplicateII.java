package leetcode.Collection;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
	/**
     * 查看数组内是否有重复元素且相邻重复元素索引间隔不大于K
     * 
     * @param nums
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	  	if(nums==null||nums.length<=1){
    	  		return false;
    	}
    	  	int i=0;
    	  	HashSet<Integer> set=new HashSet<Integer>();
    	  	for(int j=0;j<nums.length;j++){
    	  		if(!set.add(nums[j])){
    	  			return true;
    	  		}
    	  		if(set.size()>k){
    	  			set.remove(nums[i++]);
    	  		}
    	  	}
    	  	return false;
    }
}    
