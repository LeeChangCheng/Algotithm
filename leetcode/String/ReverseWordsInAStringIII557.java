package leetcode.String;
/**
 * Input: "Let's take LeetCode contest"
 *Output: "s'teL ekat edoCteeL tsetnoc"
 * @author Administrator
 *先以空格为分隔符倒置每个子字符串的位置，然后再全部倒置
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
        //此时输出为："contest LeetCode take Let's "
        
        //去掉最后的" "，并倒置全部字符
        return sb.length() == 0 ? "" : reverse(sb.substring(0, sb.length() - 1).toString());
    }
	 public String reverse(String s){
     	return new StringBuffer(s).reverse().toString();
     }
}
