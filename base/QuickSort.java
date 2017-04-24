package base;

import java.util.Arrays;

public class QuickSort{
	public static void quickSort(int[] a,int start,int end){
		int i=start,j=end;//以start为下标的数据为key
		if(a==null||a.length==0) return;
		
		while(i<j){
			while(i<j&&a[i]<=a[j])
				j--;
			if(i<j){//右侧扫描，找出第一个比key小的，交换位置
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			while(i<j&&a[i]<a[j])
				i++;
			if(i<j){//左侧扫描(此时key==a[j])，找出第一个比key大的，交换位置
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
		if(i-start>1){//调用递归，把key前面的完成排序
			quickSort(a,0,i-1);
		}
		if(end-j>1){
			quickSort(a,j+1,end);//调用递归，把key后面的完成排序
		}
	}
	
	public static void main(String[] args){
		int[] a={5,4,3,6,7,4,2,3,7,2,6,3,9,0};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}	
