package leetcode.String;
/**
 * ���������飬���Ƿ����һ���Ӵ����Ӵ��ظ�N�Σ�N>1)����Եõ�ԭ��
 * Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"

Output: False

Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the
 * @author Administrator
 *
 */
public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String str) {
		for(int i=str.length()/2;i>=1;i--){
			if(str.length()%i==0){
				String sub=str.substring(0,i);
				StringBuilder sb=new StringBuilder();
				for(int j=0;j<str.length()/i;j++){
					sb.append(sub);
				}
				if(sb.toString().equals(str))
					return true;
			}
		}
		return false;
	}
}	
