package jz_offer;
/**
 * 求出1~13的整数中1出现的次数,
 * 并算出100~1300的整数中1出现的次数
 * @author Administrator
 *暴力求法，其他方法不会
 */
public class 整数中1出现的次数 {
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
