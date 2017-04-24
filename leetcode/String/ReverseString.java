package leetcode;

public class ReverseString {
	 public String reverseString(String s) {
	        char[] ch=new char[s.length()];
	        int j=0;
	        for(int i=s.length()-1;i>=0;i--){
	            ch[j]=s.charAt(i);
	            j++;
	        }
	        String s2=String.valueOf(ch);
	        return s2;
	    }
}
