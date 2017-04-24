package leetcode;

public class LengthOfLastWord {
		public int lengthOfLastWord(String s){
			int count=0;
			//trim()去掉首尾的所有空格
			String ss=s.trim();
			for (int i = 0; i < ss.length(); i++) {
				count++;
					if(ss.charAt(i)==' ')
					count=0;
			}
			return count;
			
				
			}
			
		
		
		public static void main(String[] args) {
			System.out.println(new 
					LengthOfLastWord().lengthOfLastWord("a"));
		}
}
