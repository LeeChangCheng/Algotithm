package jz_offer;
/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * @author Administrator
 *�൱��쳲���������
 */
public class P10 {
	public int RectCover(int target) {
		if (target < 1) {
		            return 0;
		        } else if (target == 1 || target == 2) {
		            return target;
		        } else {
		            return RectCover(target-1) + RectCover(target-2);
		        }
		    }
}
