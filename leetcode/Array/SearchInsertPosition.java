package leetcode.Array;
/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ¡ú 2
[1,3,5,6], 2 ¡ú 1
[1,3,5,6], 7 ¡ú 4
[1,3,5,6], 0 ¡ú 0
 * @author Administrator
 *
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums,int target){
		int i=0;
		int j=nums.length-1;
		
		while(i<=j){
			int mid=(i+j)/2;
			if(nums[mid]==target) 
				return mid;
			else if(nums[mid]>target)
				j=mid-1;
			else
				i=mid+1;
		}
	}
	return i;
}











