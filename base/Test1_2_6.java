package base;

public class Test1_2_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	//	char[] s={'A','C','T','G','A','C','G'};
		//char[] t={'T','G','A','C','G','A','C'};
		//circularRotation(s,t);
	}
	public static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (t + t).contains(s);
    }
}
/*	public static void circularRotation(char[] s,char[] t)
	{
	char[] temp=new char[1024];
			for (int i = 0; i <s.length; i++) {
				temp[i]=s[i];
		    }
		for(int i=0;i<s.length;i++){
			int count=0;
		
		for(int j=0;j<s.length;j++){	
		if(temp[i]==t[i])
		{
			count++;
		}
	
		}
		if(count==(s.length-1))
			System.out.println("found!");
		else
			System.out.println("Not found!");
		temp[0]=s[s.length];
		temp[i+1]=s[i];
	}
	}
}
	
*/		

