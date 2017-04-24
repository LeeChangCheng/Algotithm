package leetcode.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断数组中是否包含重复元素。
 * 如果数组中任意一个数字出现了至少两次，
 * 你的函数应该返回true，如果每一个元素都是唯一的，返回false
 * @author Administrator
 *用set数据结构
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		
		if(nums!=null&&nums.length>1){
			Set<Integer> set=new HashSet<Integer>();
			for(int i:nums){
				if(set.contains(i)){
					return true;
				}else{
					set.add(i);
				}
			}
		}
		return false;
	}
}
