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
	            	//������Ԫ��ֱ���Ƴ���������Ԫ��ֱ�Ӹ��ǵ�����Ԫ�ص�λ�ã��ع�����
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
