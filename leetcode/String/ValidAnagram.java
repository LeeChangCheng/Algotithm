package leetcode.String;

import java.util.Arrays;



/**
 * 判断字符串t是否为s打乱顺序后的结果。
 * For example,s = "anagram", 
 * t = "nagaram", return true.s = "rat", t = "car", return false.
 * @author Administrator
 *最速方法
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) { 
	char[] schar=s.toCharArray();
	char[] tchar=t.toCharArray();
	
	Arrays.sort(schar);
	Arrays.sort(tchar);
//	错误写法,数组并没有重写equals，比较的仍然是地址
//	if(schar.equals(tchar))
//		return true;
//	else
//		return false;
	
//构成String后在比较
	String s1 = new String(schar); 
	  String s2 = new String(tchar); 

	  if(s1.equals(s2)) 
	    return true; 
	  else 
	    return false;
	}
}	
	
