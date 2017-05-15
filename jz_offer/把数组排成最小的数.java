package jz_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 * 
 * @author Administrator
 *本来以为是基排序的，这里用了实现compare
 */
public class 把数组排成最小的数 {
	 public String PrintMinNumber(int [] numbers) {
		String s="";
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		 //实现了Comparator接口的compare方法，将集合元素按照compare方法的规则进行排序
		Collections.sort(list, new Comparator()){
			public int compare(int s1,int s2){
				String s1=s1+""+s2;
				
			}
		}
	 }
