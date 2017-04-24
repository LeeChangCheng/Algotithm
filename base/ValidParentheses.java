package base;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s){
		Stack stack=new Stack();
		for (int i = 0; i < s.length(); i++) {
			//if not meet�����ţ���ջ(�߽�����:��һ����ջ�Ĳ�����������)
			if(s.charAt(i)!=')'&&s.charAt(i)!=']'&&s.charAt(i)!='}'){
					stack.push(s.charAt(i));
			}
			if(stack.isEmpty())
				return false;
			switch (s.charAt(i)) {
			case ')':
				if((char)stack.pop()!='(')
					return false;
				break;
			case ']':
				if((char)stack.pop()!='[')
					return false;
				break;
			case '}':
				if((char)stack.pop()!='{')
					return false;
				break;

			default:
				break;
			}
			
	}
		if(stack.size()==0)
			return true;
		else 
			return false;
	}		
	
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
