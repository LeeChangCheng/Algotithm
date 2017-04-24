package leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        int carry=0;    
        ListNode res=new ListNode(-1);
        ListNode rp=res;
        //int carry=0;
        //��������ͬ����
        //�Ȱѽ�������carry
        //�����½��ʱӦͬʱ��ֵ
        while(l1!=null||l2!=null){
            if(l1!=null){
                carry+=l1.val;
                l1=l1.next;
            }    
            if(l2!=null){
                carry+=l2.val;
                l2=l2.next;
            }    
            rp.next=new ListNode(carry%10);
            carry=carry/10;//�ⲽ��6�����Ժ�carry������ô�ã�
            rp=rp.next;
        }
         if(carry == 1)
             res.next=new ListNode(1);
         return res.next;//���return res; ���صĵ�һ��ֵ������-1������ӵڶ���ֵ��ʼ���ء�
     

    }
}    
