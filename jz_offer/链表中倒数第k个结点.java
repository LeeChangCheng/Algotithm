package jz_offer;
/**
 * д���ģ�˫ָ��
 * @author Administrator
 *
 */
public class �����е�����k����� {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null)
			return null;
		ListNode node1=head;
		ListNode node2=head;
		int count=0;
		while(node1!=null){
			node1=node1.next;
            count++;
			if(count-k-1>=0)
				node2=node2.next;
		}
       if(count<k)return null;
		return node2;
    }
	
}
