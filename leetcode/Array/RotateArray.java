package leetcode.Array;
/**
 * ����һ��n�����ȵ����飬����ѭ������k��λ��
 * @author Administrator
 *�Ƚ�kת����[0, n-1]�ڵ���,������������з�ת���ٶ�[0, k-1]λ�õ����ֽ��з�ת���ٶ�ʣ�µĲ��ֽ��з�ת
 */
public class RotateArray {
	public void rotate(int[] nums,int k){
		
		int tmp;
		
		k = k%nums.length;
		
		for(int i=0,j=nums.length-1;i<j;i++,j--){
			tmp=nums[i];
			nums[i]=nums[j];
			nums[j]=tmp;
		}
		
		for (int i=0,j=k-1;i< j;i++,j--){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i=k, j=nums.length-1;i<j;i++,j--){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
		
	}
}
