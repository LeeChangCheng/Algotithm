package leetcode.String;
/**
 * Example:

Input: "Hello, my name is John"
Output: 5
 * @author Administrator
 *
 */
public class NumberOfSegmentsInAString {
	public int countSegments(String s) {
        if(s==null||s.length()==0)
            return 0;
        String[] ss=s.split(" ");
        int count=0;
        for(String sss:ss)
            if(sss.length()!=0) count++;
        return count;    
    }
}
