package jz_offer;

import java.util.ArrayList;

/**
 * leetcode��д����
 * @author Administrator
 * ����˼�룺����һ����A������A������ۼ����Ǹ�����ô����A��ʹ��ֵ��С��A����Ϊ�ۼ�ֵ��
          ��������й��׵ġ����ǰ�����ۼ�ֵ����������Ϊ�к����ܺͣ�total��¼��ǰֵ��
��ʱ ���ʹ���maxSum ����maxSum��¼����
 *����һ��Ϳ���
 */
public class ��������������� {
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array.length==0)
            return 0;
	     int sum=array[0],max=array[0];
	     for(int i=1;i<array.length;i++){
	    	 if(sum>=0)
	    		 sum+=array[i];//����ۼƺʹ���0�����������ȥ
	    	 if(sum<0)
	    		 sum=array[i];//����ۻ���С��0����sum=array[i]
	    	 if(sum>max)
	    		 max=sum;//ά��max
	     }
	     return max;
    }
}
