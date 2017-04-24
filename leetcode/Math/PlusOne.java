package leetcode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        for (int i = digits.length-1; i >=0; i-- ) {
			if(digits[i]==10&&i!=0){
				digits[i-1]+=1;
				digits[i]=0;
			}	
		}
        int[] arr;
        if(digits[0]==10){
    	//不能写成int[] arr=new int[digits.length+1]
        //因为上面写法arr的作用域只能在if中	
    	arr=new int[digits.length+1];
        arr[0]=1;
        for (int i =1 ; i < arr.length; i++)
			arr[i]=0;
		return arr;
        }else{
        	return digits;
        }
    }
	public static void main(String[] args) {
		
	}
}
