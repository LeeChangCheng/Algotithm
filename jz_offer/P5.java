package jz_offer;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author Administrator
 *
 */
public class P5 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    //�Լ��ñʻ�һ�¾�֪����
    public int pop() {
    	while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int i=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
    	}
        return i;
	}
}
