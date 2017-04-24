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
 *˫ָ�룬һ��ָ��ֻ��¼unique�Ĳ��Ұ�����¼���ȣ�һ��ָ����ǰ��
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
