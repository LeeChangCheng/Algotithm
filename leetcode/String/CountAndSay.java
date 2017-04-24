package leetcode;

public class CountAndSay {
	public String countAndSay(int n) {
        if(n<=0)
            return null;
        String result="1";
        int q=1;
        while(q++<n){
        	int count=1;
        	 StringBuffer sb=new StringBuffer();
        	for(int i=1;i<result.length();i++){
        		if(result.charAt(i-1)==result.charAt(i))
        				count++;
        		else{
		        		sb.append(count);
		            	sb.append(result.charAt(i-1));
		            	count=1;
        		}
        	}
        		sb.append(count);
            	sb.append(result.charAt(result.length()-1));
            	result=sb.toString();
            	
        	
        	}
        return result;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CountAndSay c=new CountAndSay();
		
        System.out.println(c.countAndSay(6));
	}

}
