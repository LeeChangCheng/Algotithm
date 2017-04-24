package leetcode.String;
/**
 * ����һ���ַ������ж��ǲ��ǻ��ģ�ֻ������ĸ�����ַ���
 * �����˴�Сд�����⣬�մ�����Ϊ����Ч�Ļ���
 * For example,

"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 * @author Administrator
 *��˫ָ��
 */
public class ValidPalindrome {
	public static boolean isValidPalindrome(String s){
		if(s==null) return false;
		
		s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		//ֻ���մ�Сд��ĸ�����֣���������ת����Сд״̬��ѧϰһ��
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
