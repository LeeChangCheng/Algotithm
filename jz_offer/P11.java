package jz_offer;
/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author Administrator
 *
 */
public class P11 {
	public int NumberOf1(int n) {
		int count=0;
		char ch[]=Integer.toBinaryString(n).toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='1')
				count++;
		}
		return count;
	}
}
