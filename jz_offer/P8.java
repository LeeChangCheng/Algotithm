package jz_offer;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
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
