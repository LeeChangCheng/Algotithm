package jz_offer;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж���������
 * @author Administrator
 * 
 * �ݹ鷨�Ͷ�̬�滮��
 * 
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
	
	//��̬�滮����(�ѿ���)
	public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } 
        
}
