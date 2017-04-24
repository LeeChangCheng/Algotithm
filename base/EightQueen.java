package base;

public class EightQueen {
	private static final int N=4;
	private static int count=0;
	
	
	private static void putQueen(int[][] chess,int row){
		 /*
         * 递归终止判断：如果row==N，则说明已经成功摆放了N个皇后
         * 输出结果，终止递归
         */
		if(row==N){
			count++;
			System.out.println("第"+count+"种解决方案");
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
			return;
		}
		int[][] chessTemp=chess.clone();
		//这是Object对象的clone克隆/复制方法作用是执行后将复制一份当前对象，并返回。
		
		/**
         * 向这一行的每一个位置尝试排放皇后
         * 然后检测状态，如果安全则继续执行递归函数摆放下一行皇后
         */
		for(int i=0;i<N;i++){
            //摆放这一行的皇后，之前要清掉所有这一行摆放的记录，防止污染棋盘
            for(int j=0;j<N;j++)
                chessTemp[row][j]=0;
            chessTemp[row][i]=1;
            
            if( isSafety( chessTemp,row,i ) ){
                putQueen(chessTemp,row+1);
            }
        }
	}	
	
	private static boolean isSafety(int[][] chess,int row,int col) {
        //判断中上、左上、右上是否安全
        int step=1;
        while(row-step>=0){
            if(chess[row-step][col]==1)                //中上
                return false;
            if(col-step>=0 && chess[row-step][col-step]==1)        //左上
                return false;
            if(col+step<N && chess[row-step][col+step]==1)        //右上
                return false;
            
            step++;
        }
        return true;
    }
	public static void main(String[] args){
		int chess[][]=new int[N][N];
		//初始化棋盘chess
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				chess[i][j]=0;
			}
		}
		
		putQueen(chess,0);
		System.out.println(N+"皇后问题有"+count+"种解决方案");
	}
	
}
	


