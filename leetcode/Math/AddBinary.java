package leetcode;

public class AddBinary {
		public String addsinary(String a, String b) {
			//假设a比b长
			 int[] c_long=new int[a.length()];
			 int[] c_short=new int[b.length()];
			 //读进数组
			 for(int i=0;i<a.length();i++){
				 c_long[i]=a.charAt(i)-'0';//不能是c_long[i]=a.charAt(i)+'0',因为它表示a.charAt(i)的asc码与'0'的asc码相加得到的数
			 }
			 for (int i = 0; i < b.length(); i++) {
				c_short[i]=b.charAt(i)-'0';
			}
			 //如果a比b短，交换c_long和c_short
			 if(a.length()<b.length()){
				 int[] temp=c_long;
				 c_long=c_short;
				 c_short=temp;
			 }
			 int li=c_long.length-1;// 字符数组c_long最后一个索引下标
			 int si=c_short.length-1;// 字符数组c_short最后一个索引下标
			 int carry=0;// 下位的进位标识
			 int result=0;//结果
			 
			 while (li >= 0 && si >= 0) {
		            result = c_long[li] + c_short[si] + carry;
		            c_long[li] = result % 2;
		            carry = result / 2;

		            li--;
		            si--;
		        }

		        // 处理余下的数字
		        while (li >= 0) {
		            result = c_long[li] + carry;
		            c_long[li] = result % 2;
		            carry = result / 2;

//		            if (carry == 0) {
//		                break;
//		            }

		            li--;
		        }

		        // 将字符数组中的值转换了字符的0或者1
		        for (int i = 0; i < c_long.length; i++) {
		            c_long[i] += '0';
		        }

		        // 不需要扩展一位
		        if (carry==0) {

		            char[] ch = new char[c_long.length];
		            for (int i = 0; i < c_long.length; i++) {
		                ch[i] = (char) (c_long[i]);
		            }

		            return new String(ch);
		        } 
		        // 需要扩展一位
		        else {
		            char[] ch = new char[c_long.length + 1];
		            ch[0] = '1';
		            for (int i = 0; i < c_long.length; i++) {
		                ch[i + 1] = (char) (c_long[i]);
		            }
		            return new String(ch);
		        }
		    }
		public static void main(String[] args) {
			System.out.println(new AddBinary().addsinary("0", "0"));
		}
		
		
}
		
	


