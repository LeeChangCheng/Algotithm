package base;

public class EightQueen {
	private static final int N=4;
	private static int count=0;
	
	
	private static void putQueen(int[][] chess,int row){
		 /*
         * �ݹ���ֹ�жϣ����row==N����˵���Ѿ��ɹ��ڷ���N���ʺ�
         * ����������ֹ�ݹ�
         */
		if(row==N){
			count++;
			System.out.println("��"+count+"�ֽ������");
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
			return;
		}
		int[][] chessTemp=chess.clone();
		//����Object�����clone��¡/���Ʒ���������ִ�к󽫸���һ�ݵ�ǰ���󣬲����ء�
		
		/**
         * ����һ�е�ÿһ��λ�ó����ŷŻʺ�
         * Ȼ����״̬�������ȫ�����ִ�еݹ麯���ڷ���һ�лʺ�
         */
		for(int i=0;i<N;i++){
            //�ڷ���һ�еĻʺ�֮ǰҪ���������һ�аڷŵļ�¼����ֹ��Ⱦ����
            for(int j=0;j<N;j++)
                chessTemp[row][j]=0;
            chessTemp[row][i]=1;
            
            if( isSafety( chessTemp,row,i ) ){
                putQueen(chessTemp,row+1);
            }
        }
	}	
	
	private static boolean isSafety(int[][] chess,int row,int col) {
        //�ж����ϡ����ϡ������Ƿ�ȫ
        int step=1;
        while(row-step>=0){
            if(chess[row-step][col]==1)                //����
                return false;
            if(col-step>=0 && chess[row-step][col-step]==1)        //����
                return false;
            if(col+step<N && chess[row-step][col+step]==1)        //����
                return false;
            
            step++;
        }
        return true;
    }
	public static void main(String[] args){
		int chess[][]=new int[N][N];
		//��ʼ������chess
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				chess[i][j]=0;
			}
		}
		
		putQueen(chess,0);
		System.out.println(N+"�ʺ�������"+count+"�ֽ������");
	}
	
}
	


