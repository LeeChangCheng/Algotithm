package leetcode.String;

import java.util.Arrays;



/**
 * �ж��ַ���t�Ƿ�Ϊs����˳���Ľ����
 * For example,s = "anagram", 
 * t = "nagaram", return true.s = "rat", t = "car", return false.
 * @author Administrator
 *���ٷ���
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) { 
	char[] schar=s.toCharArray();
	char[] tchar=t.toCharArray();
	
	Arrays.sort(schar);
	Arrays.sort(tchar);
//	����д��,���鲢û����дequals���Ƚϵ���Ȼ�ǵ�ַ
//	if(schar.equals(tchar))
//		return true;
//	else
//		return false;
	
//����String���ڱȽ�
	String s1 = new String(schar); 
	  String s2 = new String(tchar); 

	  if(s1.equals(s2)) 
	    return true; 
	  else 
	    return false;
	}
}	
	
