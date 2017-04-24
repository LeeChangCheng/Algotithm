package leetcode.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����һ���������飬�ж��������Ƿ�����ظ�Ԫ�ء�
 * �������������һ�����ֳ������������Σ�
 * ��ĺ���Ӧ�÷���true�����ÿһ��Ԫ�ض���Ψһ�ģ�����false
 * @author Administrator
 *��set���ݽṹ
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		
		if(nums!=null&&nums.length>1){
			Set<Integer> set=new HashSet<Integer>();
			for(int i:nums){
				if(set.contains(i)){
					return true;
				}else{
					set.add(i);
				}
			}
		}
		return false;
	}
}
