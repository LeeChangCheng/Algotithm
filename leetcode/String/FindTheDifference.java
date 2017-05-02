package leetcode.String;
/**
 * Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
 * @author Administrator
 *�����ַ���tֻ���ַ���s����һ���ַ���
 *��ôֱ����t�������ַ�ֵ�ĺͼ�ȥ�ַ���s���ַ�ֵ�ĺͼ���
 */
public class FindTheDifference {
		public char findTheDifference(String s,String t){
			int res=0;
			for(int i=0;i<s.length();i++){
				res-=(int)s.charAt(i);
			}
			for(int i=0;i<t.length();i++){
				res+=(int)t.charAt(i);
			}
			return (char)res;
		}
}

