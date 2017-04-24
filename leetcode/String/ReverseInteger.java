package leetcode;

public class ReverseInteger {
		 public static int reverse(int x) {
		        double res=0;
				
				while(x!=0){
					res=10*res+x%10;
					x/=10;
				}
				//判断溢出
				if(res<Integer.MIN_VALUE||res>Integer.MAX_VALUE)
					return 0;
				else	
				    return (int)res;
			}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    System.out.println(reverse(22222));
	}

}
