package leetcode.Collection;

import java.util.HashMap;
import java.util.Map;
/**
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), 
 * where i and j are both numbers in the array and their absolute difference is k
 * 
 * Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * @author Administrator
 *
 */
	public class KdiffPairsInAnArray {
		public int findPairs(int[] nums,int k){
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			int i=0;
			for(int a:nums){
				map.put(a, i++);
			}
			int res=0;
			for(int j=0;j<nums.length;j++){
				if(map.containsKey(nums[j]+k)&&map.get(nums[j]+k)!=j){
					map.remove(nums[j]+k);
					res++;
				}
			}
			return res;
		}
	}
