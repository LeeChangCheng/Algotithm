package leetcode;

public class ReverseInteger {
		 public static int reverse(int x) {
		        double res=0;
				
				while(x!=0){
					res=10*res+x%10;
					x/=10;
				}
				//�ж����
				if(res<Integer.MIN_VALUE||res>Integer.MAX_VALUE)
					return 0;
				else	
				    return (int)res;
			}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    System.out.println(reverse(22222));
	}

}
