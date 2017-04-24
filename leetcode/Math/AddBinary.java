package leetcode;

public class AddBinary {
		public String addsinary(String a, String b) {
			//����a��b��
			 int[] c_long=new int[a.length()];
			 int[] c_short=new int[b.length()];
			 //��������
			 for(int i=0;i<a.length();i++){
				 c_long[i]=a.charAt(i)-'0';//������c_long[i]=a.charAt(i)+'0',��Ϊ����ʾa.charAt(i)��asc����'0'��asc����ӵõ�����
			 }
			 for (int i = 0; i < b.length(); i++) {
				c_short[i]=b.charAt(i)-'0';
			}
			 //���a��b�̣�����c_long��c_short
			 if(a.length()<b.length()){
				 int[] temp=c_long;
				 c_long=c_short;
				 c_short=temp;
			 }
			 int li=c_long.length-1;// �ַ�����c_long���һ�������±�
			 int si=c_short.length-1;// �ַ�����c_short���һ�������±�
			 int carry=0;// ��λ�Ľ�λ��ʶ
			 int result=0;//���
			 
			 while (li >= 0 && si >= 0) {
		            result = c_long[li] + c_short[si] + carry;
		            c_long[li] = result % 2;
		            carry = result / 2;

		            li--;
		            si--;
		        }

		        // �������µ�����
		        while (li >= 0) {
		            result = c_long[li] + carry;
		            c_long[li] = result % 2;
		            carry = result / 2;

//		            if (carry == 0) {
//		                break;
//		            }

		            li--;
		        }

		        // ���ַ������е�ֵת�����ַ���0����1
		        for (int i = 0; i < c_long.length; i++) {
		            c_long[i] += '0';
		        }

		        // ����Ҫ��չһλ
		        if (carry==0) {

		            char[] ch = new char[c_long.length];
		            for (int i = 0; i < c_long.length; i++) {
		                ch[i] = (char) (c_long[i]);
		            }

		            return new String(ch);
		        } 
		        // ��Ҫ��չһλ
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
		
	


