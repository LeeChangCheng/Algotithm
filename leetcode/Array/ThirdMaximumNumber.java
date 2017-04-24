package leetcode.Array;
/**
 * �������е���������������������������ڣ��򷵻�������
 * @author Administrator
 *������������¼��һ�󣬵ڶ��󣬵�����������ڱ������ݹ����и���������ֵ��
 */
public class ThirdMaximumNumber{
		
	public int thirdMax(int[] A){
		
		long first=Long.MIN_VALUE;
		long second=Long.MIN_VALUE;
		long third=Long.MIN_VALUE;
		
		for(int num:A){
			if (num == first || num == second || num == third) continue;
			if(num>first){
				third=second;
				second=first;
				first=num;
			}else if(num>second){
				third=second;
				second=num;
			}else if(num>third){
				third=num;
			}
		}
		if(third==Long.MIN_VALUE)
			return (int)first;
		return (int)third;
	}

}
