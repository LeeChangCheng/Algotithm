package leetcode.Array;
/**
 * ������������ֵ���Ӻ����

 ����һ�£�������Ǵ�ͷ����������顣���������е�����һ��Ԫ�أ���ֻ������ѡ��

 1. Ҫô����֮ǰ������Ӻ�֮�У�������һ�飩

 2. Ҫô�Լ�����һ�����飨�Լ�����һ�飩
 
���Զ������Ԫ��Ӧ�����ѡ�񣬾Ϳ����ܶ��ĸ���Ĺ��״����������һ�飬�����ܼӺͱ�󣬻��Ǹ�����һ����ˣ�
����Լ����ͷһ�飬�Լ���ֵ��֮ǰ�Ӻ͵�ֵ��Ҫ����ô�����Լ�����һ����ˡ�
��������һ��sum���飬��¼ÿһ��sum�����ֵ��
sum[i]��ʾ��ǰ���Ԫ���Ǹ�֮ǰ����Ӻ�һ�黹���Լ�����һ��ã�
Ȼ��ά��һ��ȫ�����ֵ��λ�𰸡�
 * @author Administrator
 *
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int[] sum=new int[nums.length];
        int max=nums[0];
        sum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
        	sum[i]=Math.max(nums[i], sum[i-1]+nums[i]);
        	max=Math.max(max, sum[i]);
        }
        return max;
    }

}
