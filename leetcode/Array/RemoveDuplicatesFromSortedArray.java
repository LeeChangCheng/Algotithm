package leetcode.Array;
/**
 * Given a sorted array, remove the duplicates
 *  in place such that each element appear
 *  only once and return the new length.
 *  
 *  For example,
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2].
 * @author Administrator
 *双指针，一个指针只记录unique的并且帮助记录长度，一个指针往前找
 */
public class RemoveDuplicatesFromSortedArray {
	 public int removeDuplicates(int[] A) {
		 if(A.length==0||A==null)
			 return 0;
		 
		 int len=1;
		 
		 for(int i=1;i<A.length;i++){
			 if(A[i]!=A[i-1]){
				 if(A[i]!=A[len])
					 len++;
			 }
		 }
		 return len;
	 }
}
