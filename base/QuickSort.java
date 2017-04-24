package base;

import java.util.Arrays;

public class QuickSort{
	public static void quickSort(int[] a,int start,int end){
		int i=start,j=end;//��startΪ�±������Ϊkey
		if(a==null||a.length==0) return;
		
		while(i<j){
			while(i<j&&a[i]<=a[j])
				j--;
			if(i<j){//�Ҳ�ɨ�裬�ҳ���һ����keyС�ģ�����λ��
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			while(i<j&&a[i]<a[j])
				i++;
			if(i<j){//���ɨ��(��ʱkey==a[j])���ҳ���һ����key��ģ�����λ��
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
		if(i-start>1){//���õݹ飬��keyǰ����������
			quickSort(a,0,i-1);
		}
		if(end-j>1){
			quickSort(a,j+1,end);//���õݹ飬��key������������
		}
	}
	
	public static void main(String[] args){
		int[] a={5,4,3,6,7,4,2,3,7,2,6,3,9,0};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}	
