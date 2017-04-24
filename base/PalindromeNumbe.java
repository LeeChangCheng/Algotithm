package base;

public class PalindromeNumbe {
	  	public static boolean isPalindrome(int x) {
	  	   int y=x;
	       int res=0;
	       while(x!=0){
	          res=res*10+x%10;
	          if(res>Integer.MAX_VALUE||res<0)
	            return false;  
	          x=x/10;  
	        }
	        if(res==y){
	            return true;
	        }
	        else{
	            return false;
	        }
	          
	    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
System.out.println(isPalindrome(-2147447412));
	}

}
