package leetcode.Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Given an array of integers, 
 * every element appears twice except for one. Find that single one
 * @author Administrator
 *
 */
public class SingleNumber {
	public static int singleNumber(int[] A){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int n:A){
			if(!set.add(n))
				set.remove(n);
		}
		Iterator<Integer> it=set.iterator();
		return it.next();
	}
	
	public static void main(String[] args) {
		int[] a={1,1,2,2,3};
		System.out.println(singleNumber(a));
	}
}
