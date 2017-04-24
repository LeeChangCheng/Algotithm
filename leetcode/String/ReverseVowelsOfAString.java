package leetcode.String;
/**
 * ����һ���ַ��������ַ����е�Ԫ���ַ�ת��
 * @author Administrator
 *��������ָ��i��j���ֱ�ָ���ַ�����ǰ�˺��ַ�����β�ˣ�

�����ַ������ж��ַ����ж�Ӧλ���ַ��Ƿ�ΪԪ���ַ���
�����Ԫ���ַ���ֹͣ������Ȼ������һ�����ҵ���Ӧλ�õ�Ԫ���ַ�λ�ã�
�ҵ��󣬽�����λ���ַ����н�����Ȼ�����������ֱ������������
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
