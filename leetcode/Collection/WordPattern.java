package leetcode.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a pattern and a string str, find if str follows the same pattern.

Examples: 
pattern = "abba", str = "dog cat cat dog" should return true. 
pattern = "abba", str = "dog cat cat fish" should return false. 
pattern = "aaaa", str = "dog cat cat dog" should return false. 
pattern = "abba", str = "dog dog dog dog" should return false.
 * @author Administrator
 *
 */
public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
			//ѧϰһ����ʹ��map!
			Map<Character,String> map=new HashMap<Character,String>();
			Set<String> set=new HashSet<String>();
			String[] pieces=str.split(" ");//�Կո�Ϊ������ʽ�и��ַ���;
			if(pieces.length!=pattern.length())
				return false;
			int i=0;
			for(String s:pieces){
				
			}
	}
}
