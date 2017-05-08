package jz_offer;
/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
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
