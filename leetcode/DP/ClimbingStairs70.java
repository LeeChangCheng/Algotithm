package leetcode.DP;
/**
 * ̨������Ϊn��ÿ����1�׻���2�ײ㣬������̨�׵Ĳ�ͬ�ķ�������
 * @author Administrator
 *���Ʊ��ʽΪ��
F(n) = F(n-1) + F(n-2)��F(1) = 1, F(2) = 2;

����F(n) = F(n-1) + F(n-2) = (F(n-2) + F(n-3)) + (F(n-3) + F(n-4))=.....
���ڼ�����û�б��棬Խ�����ظ�����Խ�࣬����ʹ�ö�̬�滮����F(n-1)��F(n-2) ����������
 */
public class ClimbingStairs70 {
	public int climbStairs(int n){
		if(n==1||n==2){
			return n;
		}
		int pre=2,beforePre=1;
		int count=3;
		for(int i=3;i<=n;i++){
			count=pre+beforePre;
			beforePre=pre; //beforePre��Ϊf(n-2)
			pre=count;//pre��Ϊf(n-1)
		}
		return count;
	}
}
