package leetcode.String;
/**
 * Input: "Let's take LeetCode contest"
 *Output: "s'teL ekat edoCteeL tsetnoc"
 * @author Administrator
 *���Կո�Ϊ�ָ�������ÿ�����ַ�����λ�ã�Ȼ����ȫ������
 */
public class ReverseWordsInAStringIII557 {
	public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; --i) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }
        //��ʱ���Ϊ��"contest LeetCode take Let's "
        
        //ȥ������" "��������ȫ���ַ�
        return sb.length() == 0 ? "" : reverse(sb.substring(0, sb.length() - 1).toString());
    }
	 public String reverse(String s){
     	return new StringBuffer(s).reverse().toString();
     }
}
