package leetcode;

import java.util.HashSet;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		HashSet[] row=new HashSet[9];
		HashSet[] col=new HashSet[9];
		HashSet[] cell=new HashSet[9];
		for (int i = 0; i < 9; i++) {
			row[i]=new HashSet<>();
			col[i]=new HashSet<>();
			cell[i]=new HashSet<>();	
		}
		//注意:row[i],col[i],cell[i]都是数组，如row[0]={1,2,3,4,5,6,7,8,9}
		for (int i = 0; i < 9; i++) {
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'){
					if(row[i].contains(board[i][j])
							||col[j].contains(board[i][j])
							||cell[3*(i/3)+j/3].contains(board[i][j]))
						return false;
					else{
						row[i].add(board[i][j]);
						col[j].add(board[i][j]);
						cell[3*(i/3)+j/3].add(board[i][j]);
					}
				}
			}
			
		}
		return true;
	}
}
