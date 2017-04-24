package base;

public class Test1_1_13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int count=0;
int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b=new int[3][3];
for (int i = 0; i <3; i++) {

    for (int j = 0; j < 3; j++) {
	b[j][i]=a[i][j];

	}
	
}
for (int i = 0; i <3; i++) {
	System.out.print("\n");
   for (int j = 0; j < 3; j++) {
	System.out.print(b[i][j]+" ");
	}
}
System.out.println(a[2][2]);


	}

}
