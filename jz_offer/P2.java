package jz_offer;
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author Administrator
 *
 */
public class P2 {
	 public String replaceSpace(StringBuffer str) {
	    	if(str==null)
	            return null;
	        for(int i=0;i<str.length();i++){
	            char c=str.charAt(i);
	            if(c==' ')
	                str.replace(i,i+1,"%20");//注意replace的使用方式！！！
	        }
	        return str.toString();
	    }
}
