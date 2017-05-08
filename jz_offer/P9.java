package jz_offer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * @author Administrator
 * 
 * 递归法和动态规划法
 * 
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
	
	//动态规划做法(难看懂)
	public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } 
        
}
