package base;
/**
 * 给定一个长度为n的数组，寻找其中的“众数”。众数是指出现次数大于 ⌊ n/2 ⌋ 的元素。
    可以假设数组是非空的并且数组中的众数永远存在。
 * @author Administrator
 *moore投票算法
 *模拟一个栈，起始栈为空，每读入一个数，如果栈为空就入栈，
 *如果栈不为空就和栈内元素比较，如果相同就使计数器加一，反之减一，
 *计数器为负数时将元素弹出。最后栈内元素就是正解。
 */
public class MajorityElement {
	public int majorityElement(int[] nums){
		int result=0,count=0;
		for(int i=0;i<nums.length;i++){
			if(count==0){
				result=nums[i];
				count=1;
			}else if(result==nums[i]){
				count++;
			}else{
				count--;
			}
		}
		return result;
}
