package jz_offer;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 需要合成后的链表满足单调不减规则
 * @author Administrator
 *递归版本
 */
public class 合并两个排序的链表 {
	public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
        	return list2;
        if(list2==null)
        	return list1;
        //如果list2的值大于等于ist1的值，就把list2放到list1后面
       if(list1.val<=list2.val){
    	   list1.next=Merge(list1.next,list2);
    	   return list1;
        }
       if(list2.val<=list1.val){
    	   list2.next=Merge(list2.next,list1);
    	   return list2;   	   
       }
    }
}
