package leetcode;

public class RomanToInteger {
	 public int romanToInt(String s) {
	        int res=toNumber(s.charAt(0));
	        //从一开始让i-1不越界
	        for (int i = 1; i < s.length(); i++) {
				//如果后一个字符代表的数大于前一个字符代表的数，求和时要减去2倍的前一个字符代表的数
				//因为求和时把前一个字符代表的数加上了
				if(toNumber(s.charAt(i-1))<toNumber(s.charAt(i)))
						res+=toNumber(s.charAt(i))-2*toNumber(s.charAt(i-1));
				else
					res+=toNumber(s.charAt(i));
			}
	        return res;
	    }
	 int toNumber(char ch) {  
	        switch (ch) {  
	            case 'I': return 1;  
	            case 'V': return 5;  
	            case 'X': return 10;  
	            case 'L': return 50;  
	            case 'C': return 100;  
	            case 'D': return 500;  
	            case 'M': return 1000;  
	        }  
	        return 0;
	 }
}
