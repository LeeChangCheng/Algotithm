package jz_offer;
/**
 * 
 * @author Administrator
 *��Ȼ˫ָ��
 *��ͼ������� 1-->2-->3!!!
 */
public class ��ת���� {
	public ListNode ReverseList(ListNode head) {
		if(head==null)
			return null;
		ListNode node1=null;
		ListNode node2=null;
		while(head!=null){
			node1=head.next;
			head.next=node2;
			node2=head;
			head=node1;
		}
		return node2;
	}
}
