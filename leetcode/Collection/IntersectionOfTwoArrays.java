package leetcode.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 * @author Administrator
 *使用Set，因为Set中不能有重复元素
 */
public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1,int[] nums2){
		
		Set<Integer> set =new HashSet<Integer>();
		Set<Integer> interSet=new HashSet<Integer>();
		
		for(int i=0;i<nums1.length;i++){
			set.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++){
			if(set.contains(nums2[i]))
				interSet.add(nums2[i]);
		}
		int[] result=new int[interSet.size()];
		int count=0;
		for(int num:interSet){
			result[count++]=num;
		}
		return result;
		
		
	}
}
