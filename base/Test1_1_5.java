package base;

public class Test1_1_5 {

	public static void histogram(int[] a, int n) {
        // TODO Auto-generated method stub
        int[] b = new int [n];
        for(int i = 0;i<b.length;i++)
            b[i] = 0;
        for(int i = 0;i<a.length;i++){
            b[a[i]]++;
        }
  for (int i = 0; i < b.length; i++) 
      System.out.print(b[i]+" ");
	}
	

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
int[] a = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,7,8,9};
        int M = 20;
       histogram(a, M);
	}

}
