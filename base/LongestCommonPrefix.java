package base;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
			return "";
		//遍历首个字符元素
        for(int i=0;i<strs[0].length();i++){
            //遍历整个字符数组
        	for(int j=1;j<strs.length;j++){
        		if(strs[j].length()<=i||strs[0].charAt(i)!=strs[j].charAt(i))
        			return strs[0].substring(0,i);
        	}
        }
        return strs[0];
    }
}
