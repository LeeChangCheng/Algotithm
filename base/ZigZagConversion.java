package base;

import java.util.Arrays;

public class ZigZagConversion {

	public static String convert(String s, int nRows) 
	     {
	       
	          String result = "";
	         
	         //row表示行，j表示s下标，k表示result下标
	         int step = 2*(nRows-1);
	         for(int row=0; row<nRows; row++)
	         {
	             for(int j=row; j<s.length();j+=step)
	             {
	                 result += s.charAt(j);
	                 if(row==0 || row == nRows-1)
	                     continue;
	                 
	                 //如果不是第一行或者最后一行，则还有一个斜线上的数据
	                 int slash = j + step -2*row;
	                 if(slash < s.length())
	                     result += s.charAt(slash);            
	             }
	         }
	         return result;    
	     }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
