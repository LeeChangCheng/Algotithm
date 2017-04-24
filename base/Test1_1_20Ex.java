package base;

public class Test1_1_20Ex {

	public static long f(long n)
	{
		if(n>0)
		{
		if(n<=2)
			return 1;
		if(n>2)
			return f(n-1)+f(n-2);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 System.out.println(f(6));
	}

}
