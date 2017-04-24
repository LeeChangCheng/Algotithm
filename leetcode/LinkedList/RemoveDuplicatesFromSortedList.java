<<<<<<< HEAD
package leetcode;
=======
package leetcode.LinkedList;
>>>>>>> a

public class RemoveDuplicatesFromSortedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        if(head==null||head.next==null)
	            return head;
	        ListNode item=head;    
	        while(item.next!=null){
	            if(item.val==item.next.val)
	                item.next=item.next.next;
	            else
	                item=item.next;
	                
	        }
	        return head;
	    }
	}
}
