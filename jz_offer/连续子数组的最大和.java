package jz_offer;

import java.util.ArrayList;

/**
 * leetcode上写过的
 * @author Administrator
 * 基于思想：对于一个数A，若是A的左边累计数非负，那么加上A能使得值不小于A，认为累计值对
          整体和是有贡献的。如果前几项累计值负数，则认为有害于总和，total记录当前值。
此时 若和大于maxSum 则用maxSum记录下来
 *遍历一遍就可以
 */
public class 连续子数组的最大和 {
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array.length==0)
            return 0;
	     int sum=array[0],max=array[0];
	     for(int i=1;i<array.length;i++){
	    	 if(sum>=0)
	    		 sum+=array[i];//如果累计和大于0，则继续加下去
	    	 if(sum<0)
	    		 sum=array[i];//如果累积和小于0，让sum=array[i]
	    	 if(sum>max)
	    		 max=sum;//维护max
	     }
	     return max;
    }
}
