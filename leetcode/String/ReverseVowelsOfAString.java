package leetcode.String;
/**
 * 给定一个字符串，把字符串中的元音字符转置
 * @author Administrator
 *定义两个指标i，j，分别指向字符串最前端和字符串最尾端；

遍历字符串，判断字符串中对应位置字符是否为元音字符，
如果是元音字符，停止遍历，然后在另一方向找到对应位置的元音字符位置，
找到后，将两个位置字符进行交换，然后继续遍历，直到遍历结束。
 */
public class ReverseVowelsOfAString {
	public boolean isVowels(char c){
		c=Character.toLowerCase(c);
		if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u')
			return true;
		else
			return false;
	}
	
	
	public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] ss=s.toCharArray();
        while(i<j){
        	while(i<j&&!isVowels(ss[j])){
        		j--;
        	}
        	while(i<j&&!isVowels(ss[i])){
        		i++;
        	}
        	char tmp=ss[j];
        	ss[j]=ss[i];
        	ss[i]=tmp;
        	j--;
        	i++;
        }
        return new String(ss);
    }
}
