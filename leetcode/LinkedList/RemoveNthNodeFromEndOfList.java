package leetcode;
/** ɾ������ĵ�����n��Ԫ��
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
		 //p����n����Ȼ��q��pһ���ܣ���ôp�ܵ����q�������ڵ�����n������
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
