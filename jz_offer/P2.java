package jz_offer;
/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
	                str.replace(i,i+1,"%20");//ע��replace��ʹ�÷�ʽ������
	        }
	        return str.toString();
	    }
}
