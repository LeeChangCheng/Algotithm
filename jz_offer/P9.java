package jz_offer;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж���������
 * @author Administrator
 * 
 * �ݹ鷨�Ͷ�̬�滮��
 *   f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)
 *��n��̨�ף�һ����1��2��...n�׵����ķ�ʽʱ���ܵ�����Ϊ��
              | 1       ,(n=0 ) 
f(n) =     | 1       ,(n=1 )
              | 2*f(n-1),(n>=2)
 */
public class P9 {
	//�ݹ�����
	public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }
	
	//��̬�滮����
	public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } 
        int[] a=new int[target+1];//��ŵ�i����������
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
