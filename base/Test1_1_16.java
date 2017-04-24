package base;



public class Test1_1_16 {


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(mystery(2,25));
	}
	
	public static int mystery(int a, int b) 
	{  
		if (b == 0) return 0; 
		if (b % 2 == 0)
			return mystery(a+a, b/2); 
		return mystery(a+a, b/2) + a;
		}

}
