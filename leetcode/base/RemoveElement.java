package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
	 public static int removeElement(int[] nums, int val) {
		 int len = nums.length;
		 if(len==0)
			 return 0;
		 for (int i=0; i <len; i++) {
	            if (nums[i] == val) {
	            	//将给定元素直接移除，把其他元素直接覆盖到给定元素的位置，重构数组
	            	nums[i] = nums[len-1];
	            	i--;
	            	len--;
	            	System.out.println(Arrays.toString(nums)+"\n");
	            }
	        }

	        return len;
	    }
	    public static void main(String[] args) {
	    	int[] a={3,2,2,3};
	    	removeElement(a,3);
		}
}
