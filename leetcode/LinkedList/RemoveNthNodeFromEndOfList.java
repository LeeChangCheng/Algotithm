package leetcode;
/** 删除链表的倒数第n个元素
 * Definition for singly-linked list. 
 * public class ListNode { 
 *     int val; 
 *     ListNode next; 
 *     ListNode(int x) { 
 *         val = x; 
 *         next = null; 
 *     } 
 * } 
 */  
public class RemoveNthNodeFromEndOfList {
	 public ListNode removeNthFromEnd(ListNode head, int n){
		 // Note: The Solution object is instantiated only once and is reused by each test case.  
		 //p先跑n步，然后q和p一起跑，那么p跑到最后，q就正好在倒数第n个上面
	        if(head == null)  
	            return null;  
	        ListNode p = head;  
	        ListNode q = head;  
	        for(int i = 0; i < n; i++)  
	        {  
	            q = q.next;  
	        }  
	        if(q == null)  
	        {  
	            head = head.next;  
	            p = null;  
	            return head;  
	        }  
	        while(q.next != null)  
	        {  
	            p = p.next;  
	            q = q.next;  
	        }  
	        ListNode tmp = p.next.next;  
	        p.next = tmp;  
	        return head;  
	           
	 }
	 
}
