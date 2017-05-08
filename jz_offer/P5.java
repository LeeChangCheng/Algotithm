package jz_offer;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author Administrator
 *
 */
public class P5 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    //自己拿笔画一下就知道了
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
