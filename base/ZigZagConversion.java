package base;

import java.util.Arrays;

public class ZigZagConversion {

	public static String convert(String s, int nRows) 
	     {
	       
	          String result = "";
	         
	         //row��ʾ�У�j��ʾs�±꣬k��ʾresult�±�
	         int step = 2*(nRows-1);
	         for(int row=0; row<nRows; row++)
	         {
	             for(int j=row; j<s.length();j+=step)
	             {
	                 result += s.charAt(j);
	                 if(row==0 || row == nRows-1)
	                     continue;
	                 
	                 //������ǵ�һ�л������һ�У�����һ��б���ϵ�����
	                 int slash = j + step -2*row;
	                 if(slash < s.length())
	                     result += s.charAt(slash);            
	             }
	         }
	         return result;    
	     }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
