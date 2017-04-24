package leetcode.Array;
/**
 * 求数组中第三大的数，如果第三大的数不存在，则返回最大的数
 * @author Administrator
 *用三个变量记录第一大，第二大，第三大的数，在遍历数据过程中更新这三个值。
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
