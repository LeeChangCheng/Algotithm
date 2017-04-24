package base;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s){
		Stack stack=new Stack();
		for (int i = 0; i < s.length(); i++) {
			//if not meet右括号，进栈(边界条件:第一个进栈的不能是右括号)
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
		// TODO 自动生成的方法存根

	}

}
