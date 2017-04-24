package leetcode.String;
/**
 * 给定一个字符串，判断是不是回文，只考虑字母数字字符，
 * 并不顾大小写。另外，空串被认为是有效的回文
 * For example,

"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 * @author Administrator
 *用双指针
 */
public class ValidPalindrome {
	public static boolean isValidPalindrome(String s){
		if(s==null) return false;
		
		s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		//只接收大小写字母和数字，并把它们转换成小写状态，学习一个
		System.out.println(s);
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;			
		}
	
	return true;
	}
	
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		 
		System.out.println(isValidPalindrome(str));
	}
}	
