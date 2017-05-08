package jz_offer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author Administrator
 *
 */
public class P8 {
	public int JumpFloor(int n) {
        int a=1,b=2,c=0;
		if(n==1)
            return 1;
        if(n==2)
            return 2;
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
        return c;
    }
}
