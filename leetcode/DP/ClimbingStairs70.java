package leetcode.DP;
/**
 * 台阶总数为n，每次爬1阶或者2阶层，求爬完台阶的不同的方法数。
 * @author Administrator
 *递推表达式为：
F(n) = F(n-1) + F(n-2)，F(1) = 1, F(2) = 2;

由于F(n) = F(n-1) + F(n-2) = (F(n-2) + F(n-3)) + (F(n-3) + F(n-4))=.....
由于计算结果没有保存，越往后，重复计算越多，考虑使用动态规划，将F(n-1)和F(n-2) 保存下来。
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
			beforePre=pre; //beforePre即为f(n-2)
			pre=count;//pre即为f(n-1)
		}
		return count;
	}
}
