package leetcode.Collection;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
	/**
     * �鿴�������Ƿ����ظ�Ԫ���������ظ�Ԫ���������������K
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
