package jz_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
 * 
 * @author Administrator
 *������Ϊ�ǻ�����ģ���������ʵ��compare
 */
public class �������ų���С���� {
	 public String PrintMinNumber(int [] numbers) {
		String s="";
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		 //ʵ����Comparator�ӿڵ�compare������������Ԫ�ذ���compare�����Ĺ����������
		Collections.sort(list, new Comparator()){
			public int compare(int s1,int s2){
				String s1=s1+""+s2;
				
			}
		}
	 }
