package jz_offer;

public class 合并两个排序的链表 {
	public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
        	return list2;
        if(list2==null)
        	return list1;
        ListNode node1=list1;
        ListNode node2=list2;
        if(list1.val>=list2.val){
        	while(node2.next.val<=list1.val)
        	node2=node2.next;
        	
        }
    }
}
