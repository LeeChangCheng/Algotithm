package leetcode.Collection;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
/**
 * Éú³ÉÑî»ÔÈý½Ç
 * @author Administrator
 *
 */
public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) { 
		List<List<Integer>> ret=new ArrayList<List<Integer>>();
		
		for(int i=0;i<numRows;i++){
			List<Integer> list =new ArrayList<Integer>();
			
			if(i==0){
				list.add(1);
			}else{
				List<Integer> pre=ret.get(ret.size()-1);
				for(int j=0;j<=i;j++){
					if(j==0||j==i){
						list.add(1);
					}else{
						list.add(pre.get(j-1)+pre.get(j));
					}
				}
			}
			ret.add(list);
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(generate(20));
	}
}
