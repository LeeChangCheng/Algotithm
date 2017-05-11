package jz_offer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * @author Administrator
 * 
 * 递归法和动态规划法
 *   f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)
 *在n阶台阶，一次有1、2、...n阶的跳的方式时，总得跳法为：
              | 1       ,(n=0 ) 
f(n) =     | 1       ,(n=1 )
              | 2*f(n-1),(n>=2)
 */
public class P9 {
	//递归做法
	public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }
	
	//动态规划做法
	public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } 
        int[] a=new int[target+1];//存放第i级的跳法数
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=target;i++){
        	a[i]=0;
        	for(int j=0;j<i;j++){
        		a[i]+=a[j];
        	}
        	
        }
        return a[target];
        		
}
