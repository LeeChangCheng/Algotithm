package leetcode.String;
/**
 * ����һ���ַ�����Ѱ����������������С����������������ָ��
 * �����ַ�����ĳһ���������У�
 * �������в������������ַ����������У����ҳ����
 * ����������������У��������ڣ�����-1
 * @author Administrator
 *�Ƚ������ַ����ĳ��ȣ�������ȣ��򷵻س��ȵĽϴ�ֵ��
 *����������ж������ַ����Ƿ���ͬ������ͬ�򷵻�-1�����򷵻س���
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
