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
 *由于字符串t只比字符串s多了一个字符，
 *那么直接用t中所有字符值的和减去字符串s中字符值的和即可
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

