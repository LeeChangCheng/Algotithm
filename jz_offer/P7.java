package jz_offer;
/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
n<=39
 * @author Administrator
 *
 */
public class P7 {
	public int Fibonacci(int n) {
        int a=1,b=1,c=0;
		if(n<=0)
            return 0;
        else if(n==1||n==2)
            return 1;
        else
            for(int i=3;i<=n;i++){
                c=a+b;
                b=a;
                a=c;
            }
        return c;
    }
}