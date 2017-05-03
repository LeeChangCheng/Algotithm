package leetcode.String;
/**
 * 给定一组字符串，寻找其最长不公共子序列。最长不公共子序列是指：
 * 这组字符串中某一个的子序列，
 * 该子序列不是其余任意字符串的子序列，并且长度最长
 * 返回最长不公共子序列，若不存在，返回-1
 * @author Administrator
 *比较两个字符串的长度，若不相等，则返回长度的较大值，
 *若相等则再判断两个字符串是否相同，若相同则返回-1，否则返回长度
 */
public class LongestUncommonSubsequenceI521 {
	public int findLUSlength(String a, String b) {
		if(a.length()!=b.length())
			return Math.max(a.length(),b.length());
		else if(!a.equals(b))
			return a.length();
		else return -1;
	}
}
