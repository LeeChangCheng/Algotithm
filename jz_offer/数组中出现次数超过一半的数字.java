package jz_offer;

import java.util.Arrays;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬
 * ������2����������������0��
 * @author Administrator
 *���������������������������ڣ���һ���������м��Ǹ���
 */
public class �����г��ִ�������һ������� {
	public int MoreThanHalfNum_Solution(int [] array) {
		if(array.length==0)
			return 0;
		Arrays.sort(array);
		int num=array[array.length/2];
		int count=0;//��¼�����м��Ǹ������ֵĴ���
		for(int i=0;i<array.length;i++){
			if(array[array.length/2]==array[i])
				count++;
		}
		if(count<=array.length/2)
			num=0;
		return num;
	}
}
