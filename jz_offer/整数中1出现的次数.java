package jz_offer;
/**
 * ���1~13��������1���ֵĴ���,
 * �����100~1300��������1���ֵĴ���
 * @author Administrator
 *�����󷨣�������������
 */
public class ������1���ֵĴ��� {
	public int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
		while(n>0){
			char[] ch=String.valueOf(n).toCharArray();
			for(int i=0;i<ch.length;i++){
				if(ch[i]=='1')
					count++;
			}
			n--;
		}
		return count;
	}
}
