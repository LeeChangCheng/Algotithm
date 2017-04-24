package leetcode;

public class Implement_strStr {
	public int strStr(String haystack, String needle) {
        /*
         * 边界条件:needle.length<=haystack.length
         *               needle.length!=0;
         */
		if(needle.length()>haystack.length())
			return -1;
		if(needle.equals(""))
			return 0;
		//暴力求解法
		for (int i = 0; i <=haystack.length()-needle.length(); i++) {
			int count=0;
			for (int j = 0,k=i; j < needle.length(); j++,k++) {
				if(needle.charAt(j)==haystack.charAt(k))
				count++;
				if(count==needle.length())
					return i;
			}
			
		}
		return -1;
			
	
    }
}
