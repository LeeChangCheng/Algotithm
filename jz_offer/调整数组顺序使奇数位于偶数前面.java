package jz_offer;
/**����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * 
 * @author Administrator
 *ʹ��ð�������˼��ʹ��������������ǰ�沢��֤���λ�ò���
 */
public class ��������˳��ʹ����λ��ż��ǰ�� {
	public void reOrderArray(int [] array) {
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]%2==0&&array[j+1]%2!=0){
					int t=array[j];
					array[j]=array[j+1];
					array[j+1]=t;
				}
			}	
    }
}
