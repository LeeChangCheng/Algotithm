package jz_offer;
/**输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * @author Administrator
 *使用冒泡排序的思想使得奇数排在整数前面并保证相对位置不变
 */
public class 调整数组顺序使奇数位于偶数前面 {
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
