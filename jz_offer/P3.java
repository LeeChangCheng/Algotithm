package jz_offer;
/**
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 * @author Administrator
 *
 */
public class P3 {
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        Stack<Integer> stack = new Stack();
	        while (listNode != null) {
	            stack.push(listNode.val);
	            listNode = listNode.next;
	        }
	 
	        ArrayList<Integer> list = new ArrayList();
	        while (!stack.isEmpty()) {
	            list.add(stack.pop());
	        }
	        return list;       
	    }
}
